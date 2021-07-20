package HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
public class Details {
   public static void main(String args[]) {
      /* This is how to declare HashMap */
      HashMap<String, Integer> hmap = new HashMap<String, Integer>();

      /*Adding elements to HashMap*/
      hmap.put( "Chaitanya", 12);
      hmap.put("Rahul", 2);
      hmap.put("Singh", 7);
      hmap.put("Ajeet",49);
      /* Display content using Iterator*/
      Set set = hmap.entrySet();
      Iterator iterator = set.iterator();
      while(iterator.hasNext()) {
         Map.Entry mentry = (Map.Entry)iterator.next();
         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
         System.out.println(mentry.getValue());
      }

      Map<String, Integer> map = new TreeMap<String, Integer>(hmap); 
      System.out.println("After Sorting:");
      Set set2 = map.entrySet();
      Iterator iterator2 = set2.iterator();
      while(iterator2.hasNext()) {
           Map.Entry me2 = (Map.Entry)iterator2.next();
           System.out.print(me2.getKey() + ": ");
           System.out.println(me2.getValue());
      }
      System.out.println(hmap);
      System.out.println(map);
      
      Map<Integer, Object[]> data1 = new HashMap<Integer, Object[]>();
      data1.put(0, new Object[] {"5094651517","RICK","SCHIED","ServiceExpiration_06032021.csv"});
      data1.put(1, new Object[] {"5094668032","SHIRLEY","NOKES","ServiceExpiration_06032021.csv"});
      System.out.println(data1);
      Set <Integer> keyset = data1.keySet();
      System.out.println(keyset);
//      Iterator iterator3 = keyset.iterator();
      for (Object key : keyset){
           
    	  Object [] objArr = data1.get(key);
    	  System.out.println("Array print="+Arrays.toString(objArr));
    	  for (int i = 0; i < objArr.length; i++)
    	      System.out.println(objArr[i]);
      }
      
   }
}
