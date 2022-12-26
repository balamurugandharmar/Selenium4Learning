package week3.day2;

import java.util.*;

public class CharactersCount {
    public static void main(String[] args) {
        String text = "amazon development center";
        char[] textCharArr = text.toCharArray();
        Map<Character, Integer> charCount = new LinkedHashMap<Character, Integer>();

        for (char c : textCharArr) {
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }

        System.out.println(charCount);
    }
}
