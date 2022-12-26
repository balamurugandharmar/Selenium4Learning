package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
        String text = "google";
        Set<Character> unique = new LinkedHashSet<Character>();
        for (int i = 0; i < text.length(); i++) {
            unique.add(text.charAt(i));
        }

        System.out.println(unique);
    }
}
