package org.fouda.solutions;

import java.util.Set;
import java.util.stream.Collectors;

public class TwoStrings {
    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        Set<Character> chars = transform(s1);
        chars.retainAll(transform(s2));
        return (chars.size() > 0) ? ("YES") : ("NO");
    }

    static Set<Character> transform(String s) {
        return s.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
    }
}