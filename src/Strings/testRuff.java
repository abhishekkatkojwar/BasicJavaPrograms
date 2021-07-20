package Strings;

import java.util.HashMap;
import java.util.Map;

public class testRuff {

	public static void CharCountInString(String str) {

		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();

		char[] strArray = str.toCharArray();
		System.out.println(Character.isAlphabetic(str.charAt(4)));
		for (char c : strArray) {

			if (hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c) + 1);
			} else {
				hmap.put(c, 1);
			}
		}
		for (HashMap.Entry entry : hmap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	public static void main(String[] args) {

//		String str = "I am happy and why not and why are you not happy and you should be";
//		String[] arr = str.split(" ");
//		Map<String, Integer> map = new HashMap<>();
//
//		for (int i = 0; i < arr.length; i++) {
//			if (!map.containsKey(arr[i])) {
//				map.put(arr[i], 1);
//			} else {
//				map.put(arr[i], map.get(arr[i]) + 1);
//			}
//		}
//		for (Map.Entry each : map.entrySet()) {
//
//			System.out.println(each.getKey() + " = " + each.getValue()
//					+ " times");
//		}
		
		String st="abhishek123katkojwar456";
		char [] ch=st.toCharArray();
		String charectrs = "";
		String alphabates = "";
		for (int i=0; i<ch.length; i++){
			for(char ch1='a'; ch1<='z'; ch1++){
				if(ch[i]==ch1){
				charectrs+=ch[i];
				}
			}
			
		}
		System.out.println(charectrs);
		System.out.println(alphabates);
	}

}
