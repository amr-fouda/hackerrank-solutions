package org.fouda.solutions;

public class CountingValleys {
    public static void main(String[] args) {
        System.out.println(1 == countingValleys(8, "UDDDUDUU"));
        System.out.println(2 == countingValleys(12, "DDUUDDUDUUUD"));
    }

    public static int countingValleys(int steps, String path) {
        int result = 0;
        int counter = 0;
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'U') {
                counter++;
            } else if (path.charAt(i) == 'D') {
                counter--;
            }
            if (i != 0 && counter == 0 && path.charAt(i) == 'U') {
                result++;
            }
        }
        return result;
    }
}
