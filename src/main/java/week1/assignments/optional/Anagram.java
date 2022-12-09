package week1.assignments.optional;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";

		if (text1.length() == text2.length()) {
			char[] charText1 = text1.toCharArray();
			char[] charText2 = text2.toCharArray();
			Arrays.sort(charText1);
			Arrays.sort(charText2);
			if (charText1.equals(charText2)) {
				System.out.println("Given input are Anagrams!");
			} else {
				System.out.println("Given inputs are not Anagrams!");
			}
		} else {
			System.out.println("Given inputs are not Anagrams!");
		}
	}
}