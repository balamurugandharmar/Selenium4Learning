package week4.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercises {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Bala");
        list.add("Murugan");
        list.add("Murugan");
        Set<String> set = new HashSet<>(list);
        System.out.println(set);
    }
}
