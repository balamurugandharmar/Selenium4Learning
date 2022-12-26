package week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;

public class sample {
    public static void main(String[] args) {
        String text = "amazon development center";
        char[] textCharArr = text.toCharArray();
        Map<Character, Integer> charCount = new LinkedHashMap<Character, Integer>();

        for (int i=0; i < textCharArr.length; i++) {
            System.out.println("When character is '" + textCharArr[i] + "' --> " + charCount.put(textCharArr[i], (i+1)));
        }
    }
}
