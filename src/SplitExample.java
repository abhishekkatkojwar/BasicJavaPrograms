public class SplitExample{ 
	public static void main(String args[]){
		String s1="java string split method by javat point";
		String[] words=s1.split("\\s");//splits the string based on string
		//using java for each loop to print elements of string array
		for(String w:words){
			System.out.println(w);
			
		}
		String word = "BC+D*E-";
			for (char c : word.toCharArray()) {
			    if(!(Character.isLetter(c))){
			        System.out.println("Not a character!");
			        break;
			    }
			}
			String newstr = "Word#$#$% Word 1234".replaceAll("[^A-Za-z]+", "");
			// newstr will become WordWord
			System.out.println(newstr);
			
			String str = "This 1231 is 124 a String 1243 to 34563 use 5455";
			// remove all numbers
			String newStr = str.replaceAll("[0-9]+", "");
			System.out.println("remove all numbers="+newStr);
			
			// remove all words and special characters except digits
			newStr = str.replaceAll("[^0-9]+", "");
			System.out.println("remove all words and special characters except digits="+newStr);

			// remove all words with 'Java'
			newStr = str.replaceAll("[A-Za-z]+", "Java");
			System.out.println(newStr);
	}
} 