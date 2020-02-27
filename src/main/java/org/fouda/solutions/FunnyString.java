package org.fouda.solutions;

public class FunnyString {

    // Complete the funnyString function below.
    static String funnyString(String s) {
        String r = new StringBuilder(s).reverse().toString();
        for (int i = 0; i < s.length() - 1; i++) {
            if (abs(s.charAt(i), s.charAt(i + 1)) != abs(r.charAt(i), r.charAt(i + 1)))
                return "Not Funny";
        }
        return "Funny";
    }

    static int abs(char first, char second) {
        return Math.abs(first - second);
    }

    public static void main(String[] args) {
        System.out.println(funnyString("acxz").equalsIgnoreCase("Funny"));
        System.out.println(funnyString("bcxz").equalsIgnoreCase("Not Funny"));
    }
}
