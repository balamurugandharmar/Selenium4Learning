package week1.assignments.mandatory;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		String[] splitText = text.split(" ");

		for (int i = 0; i < splitText.length; i++) {
			for (int j = 0; j < splitText.length; j++) {
				if (i != j) {
					if (splitText[i].equalsIgnoreCase(splitText[j])) {
						count++;
					}
				}
			}
			if (count > 1) {
				text = text.replace(splitText[i], "");
			}
			count = 0;
		}
		System.out.println("Non duplicate input: " + text);
	}
}