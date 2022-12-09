package week1.assignments.mandatory;

public class Palindrome {

	public static void main(String[] args) {
		String text = "madam";
		String reverseText = "";

		for (int i = text.length(); i > 0; i--) {
			reverseText = reverseText + (text.charAt(i - 1));
		}

		if (text.equalsIgnoreCase(reverseText)) {
			System.out.println("The given text '" + text + "' is a palindrome!");
		} else {
			System.out.println("The given text '" + text + "' is a not palindrome!");
		}
	}
}