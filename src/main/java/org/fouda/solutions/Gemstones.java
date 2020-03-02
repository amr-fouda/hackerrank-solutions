package org.fouda.solutions;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Gemstones {
    // Complete the gemstones function below.
    static int gemstones(String[] arr) {
        Set<Character> gems = new HashSet<>(26);
        gems.addAll(convert(arr[0]));
        for (int i = 1; i < arr.length; i++) {
            gems.retainAll(convert(arr[i]));
        }
        return gems.size();
    }

    public static Set<Character> convert(String input) {
        return input.chars().mapToObj(value -> (char) value).collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        System.out.println(gemstones(new String[]{"abcdde", "baccd", "eeabg"}) == 2);
    }
}
