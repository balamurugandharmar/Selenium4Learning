package week1.assignments.mandatory;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] splitTest = test.split(" ");
		int counter = 1;

		for (int i = 0; i < splitTest.length; i++) {
			if (counter % 2 != 0) {
				System.out.print(splitTest[i]);
			}

			if (counter % 2 == 0) {
				char[] tempArray = splitTest[i].toCharArray();
				for (int x = tempArray.length - 1; x >= 0; x--) {
					System.out.print(tempArray[x]);
				}
				tempArray = new char[0];
			}
			counter++;
			System.out.print(" ");
		}
	}
}