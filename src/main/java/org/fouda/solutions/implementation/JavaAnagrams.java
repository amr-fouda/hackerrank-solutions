package org.fouda.solutions.implementation;

import java.util.Map;

import static java.util.stream.Collectors.*;

public class JavaAnagrams {
    static boolean isAnagram(String a, String b) {
        return countCharacters(a).equals(countCharacters(b));
    }

    public static Map<Character, Integer> countCharacters(String input) {
        return input.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .collect(groupingBy(c -> c, summingInt(c -> 1)));
    }

}
