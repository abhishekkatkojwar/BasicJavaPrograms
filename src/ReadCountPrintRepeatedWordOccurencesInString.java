//package in.bench.resources.count.print.occurences;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
 
public class ReadCountPrintRepeatedWordOccurencesInString {
 
    // main() method - entry point to start execution
    public static void main(String[] args) {
 
        // sample test string
        String testStr = "Science blank Maths blank blank Physics blank Maths Physics Physics";
 
        // invoke to count & print for supplied file
        countAndPrintRepeatedWordOccurences(testStr);
    }
 
    /**
     * this method is used to count number repeated word occurrences
     * @param fileName
     */
    public static void countAndPrintRepeatedWordOccurences(String strContent) {
 
        // Step 1: create Map of String-Integer
        Map<String, Integer> mapOfRepeatedWord = new HashMap<String, Integer>();
 
        // Step 2: split line using space as delimiter
        String[] words = strContent.split(" ");
 
        // Step 3: iterate through String[] array
        for(String word : words) {
 
            // Step 4: convert all String into lower case, before comparison
            String tempUCword = word.toLowerCase();
 
            // Step 5: check whether Map contains particular word, already 
            if(mapOfRepeatedWord.containsKey(tempUCword)){
 
                // Step 6: If contains, increase count value by 1
                mapOfRepeatedWord.put(tempUCword, mapOfRepeatedWord.get(tempUCword) + 1);
            } 
            else {
 
                // Step 7: otherwise, make a new entry
                mapOfRepeatedWord.put(tempUCword, 1);
            }
        }
 
        System.out.println("Before sorting : \n");
        System.out.println("Words" + "\t\t" + "Count");
        System.out.println("======" + "\t\t" + "=====");
 
        // Step 8: print word along with its count
        for(Map.Entry<String, Integer> entry : mapOfRepeatedWord.entrySet()){
            System.out.println(entry.getKey() + "\t\t" + entry.getValue());
        }
 
        // Step 9: Sorting logic by invoking sortByCountValue() method
        Map<String, Integer> wordLHMap = sortByCountValue(mapOfRepeatedWord);
 
        System.out.println("\n\nAfter sorting in descending order of count : \n");
        System.out.println("Words" + "\t\t" + "Count");
        System.out.println("======" + "\t\t" + "=====");
 
        // Step 10: Again print after sorting
        for(Map.Entry<String, Integer> entry : wordLHMap.entrySet()){
            System.out.println(entry.getKey() + "\t\t" + entry.getValue());
        }
    }
 
    /**
     * this method sort acc. to count value
     * @param mapOfRepeatedWord
     * @return
     */
    public static Map<String, Integer> sortByCountValue(
            Map<String, Integer> mapOfRepeatedWord) {
 
        // get entrySet from HashMap object
        Set<Map.Entry<String, Integer>> setOfWordEntries = mapOfRepeatedWord.entrySet();
 
        // convert HashMap to List of Map entries
        List<Map.Entry<String, Integer>> listOfwordEntry = 
                new ArrayList<Map.Entry<String, Integer>>(setOfWordEntries);
 
        // sort list of entries using Collections class utility method sort(ls, cmptr)
        Collections.sort(listOfwordEntry, 
                new Comparator<Map.Entry<String, Integer>>() {
 
            @Override
            public int compare(Entry<String, Integer> es1, 
                    Entry<String, Integer> es2) {
                return es2.getValue().compareTo(es1.getValue()); // NOTE
            }
        });
 
        // store into LinkedHashMap for maintaining insertion order
        Map<String, Integer> wordLHMap = 
                new LinkedHashMap<String, Integer>();
 
        // iterating list and storing in LinkedHahsMap
        for(Map.Entry<String, Integer> map : listOfwordEntry){
            wordLHMap.put(map.getKey(), map.getValue());
        }
 
        return wordLHMap;
    }
}