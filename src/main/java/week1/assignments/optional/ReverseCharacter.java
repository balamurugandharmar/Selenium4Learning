package week1.assignments.optional;

public class ReverseCharacter {

	public static void main(String[] args) {
		String input = "de12ef35777777yu";
		String reverse = "";

		for (int i = input.length(); i > 0; i--) {
			if (!Character.isDigit(input.charAt(i - 1))) {
				reverse = reverse + input.charAt(i - 1);
			}
		}
		System.out.println(reverse);
	}
}