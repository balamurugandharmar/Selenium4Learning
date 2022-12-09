package week1.assignments.optional;

public class SumOfDigitsFromString {

	public void method1(String text) {
		int sum = 0;
		text = text.replaceAll("[^0-9]", "");
		char[] textArray = text.toCharArray();
		for (int i = 0; i < textArray.length; i++) {
			sum = sum + Character.getNumericValue(textArray[i]);
		}
		System.out.println("Sum using method 1: " + sum);
	}

	public void method2(String text) {
		int sum = 0;
		for (int i = 0; i < text.length(); i++) {
			if (Character.isDigit(text.charAt(i))) {
				sum = sum + Character.getNumericValue(text.charAt(i));
			}
		}
		System.out.println("Sum using method 2: " + sum);
	}

	public static void main(String[] args) {
		String text = "Tes12Le79af65";
		SumOfDigitsFromString sod = new SumOfDigitsFromString();
		sod.method1(text);
		sod.method2(text);
	}
}
