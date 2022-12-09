package week1.assignments.mandatory;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] charArrayTest = test.toCharArray();

		for (int i = 0; i < charArrayTest.length; i++) {
			if ((i + 1) % 2 != 0) {
				charArrayTest[i] = Character.toUpperCase(charArrayTest[i]);
			}
		}

		System.out.println("Processed input with Odd index upper case: ");
		for (int i = 0; i < charArrayTest.length; i++) {
			System.out.print(charArrayTest[i]);
		}
	}
}