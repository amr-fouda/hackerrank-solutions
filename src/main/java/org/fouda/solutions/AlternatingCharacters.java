package org.fouda.solutions;

public class AlternatingCharacters {
    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {
        char last = s.charAt(0);
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (last == s.charAt(i))
                count++;
            else
                last = s.charAt(i);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(alternatingCharacters("AAAA") == 3);
        System.out.println(alternatingCharacters("BBBBB") == 4);
        System.out.println(alternatingCharacters("ABABABAB") == 0);
        System.out.println(alternatingCharacters("BABABA") == 0);
        System.out.println(alternatingCharacters("AAABBB") == 4);

    }
}
