package org.fouda.solutions;

public class HackerrankInString {
    final static String HACKER_RANK = "hackerrank";

    static String hackerrankInString(String s) {
        int index = 0;
        for (char c : s.toCharArray()) {
            if (index < HACKER_RANK.length() && c == HACKER_RANK.charAt(index)) {
                index++;
            }
        }
        return index == 10 ? "YES" : "NO";
    }

    public static void main(String[] args) {
        System.out.println(hackerrankInString("hereiamstackerrank").equalsIgnoreCase("YES"));
        System.out.println(hackerrankInString("hackerworld").equalsIgnoreCase("NO"));

        System.out.println(hackerrankInString("hhaacckkekraraannk").equalsIgnoreCase("YES"));
        System.out.println(hackerrankInString("rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt").equalsIgnoreCase("NO"));
    }
}
