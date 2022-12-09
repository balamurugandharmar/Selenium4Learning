package challenges.java;

public class challenge1 {

	public static void main(String[] args) {
		String input1 = "Hello World";
		String input2 = "   fly me   to   the moon  ";
		String input3 = "luffy is still joyboy";
		String[] arrayInput1 = input1.split(" ");
		String[] arrayInput2 = input2.split(" ");
		String[] arrayInput3 = input3.split(" ");

		System.out.println("Length of last word of input1 : " + arrayInput1[arrayInput1.length - 1].length());
		System.out.println("Length of last word of input2 : " + arrayInput2[arrayInput2.length - 1].length());
		System.out.println("Length of last word of input3 : " + arrayInput3[arrayInput3.length - 1].length());

	}

}
