package week1.day2;

public class ReverseString {

	public static void main(String[] args) {
		String name = "Balamurugan";
		char[] nameCharArray = name.toCharArray();
		for (int i=nameCharArray.length-1; i>=0; i--) {
			System.out.print(nameCharArray[i]);
		}
	}
}
