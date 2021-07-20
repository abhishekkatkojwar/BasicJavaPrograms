package Strings;
//Java prorgam to count frequencies of 
//characters in string without using Hashmap 

public class newPro {
	public static void main(String[] args) {
		int wordCount = 0;
		String word = "Abhishekkatkojwar";

		for (char letter = 'a'; letter <= 'z'; letter++) {
			for (int i = 0; i < word.length(); i++) {
				if (word.charAt(i) == letter) {
					wordCount++;
//					System.out.println(word.charAt(i));
				}
			}
			if (wordCount > 0) {
				System.out.println(letter + "=" + wordCount);
				wordCount = 0;
			}
		}
		for (char letter = 'A'; letter <= 'Z'; letter++) {
			for (int i = 0; i < word.length(); i++) {
				if (word.charAt(i) == letter) {
					wordCount++;
//					System.out.println(word.charAt(i));
				}
			}
			if (wordCount > 0) {
				System.out.println(letter + "=" + wordCount);
				wordCount = 0;
			}
		}
	}

}
