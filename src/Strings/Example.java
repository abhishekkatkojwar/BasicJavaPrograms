package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {

	public static void main(String[] args) {
		String input = "Hello123";
		int output = extractInt(input);

		System.out.println("input [" + input + "], output [" + output + "]");
	}
	// Parses first group of consecutive digits found into an int.
	//
	public static int extractInt(String str) {
		Matcher matcher = Pattern.compile("\\d+").matcher(str);

		if (!matcher.find())
			throw new NumberFormatException("For input string [" + str + "]");

		return Integer.parseInt(matcher.group());
	}
}