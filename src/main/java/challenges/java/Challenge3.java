package challenges.java;

public class Challenge3 {
    public static void main(String[] args) {
        String input1 = "A man, a plan, a canal: Panama";
        String input2 = "race a car";
        String reverseInput1 = "";
        String reverseInput2 = "";

        input1 = input1.toLowerCase();
        input2 = input2.toLowerCase();

        input1 = input1.replaceAll("[^a-zA-Z]", "");
        input2 = input2.replaceAll("[^a-zA-Z]", "");

        for (int i = input1.length(); i > 0; i--) {
            reverseInput1 = reverseInput1 + input1.charAt(i-1);
        }

        for (int i = input2.length(); i > 0; i--) {
            reverseInput2 = reverseInput2 + input2.charAt(i-1);
        }

        if (input1.equalsIgnoreCase(reverseInput1)) {
            System.out.println("Input1 is Palindrome");
        } else {
            System.out.println("Input1 is not a Palindrome");
        }

        if (input2.equalsIgnoreCase(reverseInput2)) {
            System.out.println("Input2 is Palindrome");
        } else {
            System.out.println("Input2 is not a Palindrome");
        }
    }
}
