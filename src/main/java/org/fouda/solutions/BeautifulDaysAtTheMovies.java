package org.fouda.solutions;

import java.util.stream.IntStream;

public class BeautifulDaysAtTheMovies {
    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
        return (int) IntStream.range(i, j + 1)
                .filter(number -> isBeautiful(Math.abs((double) (number - reverse(number))) / k))
                .count();
    }

    private static boolean isBeautiful(double i) {
        return i % 1 == 0;
    }

    public static int reverse(int input) {
        return Integer.parseInt(new StringBuilder(Integer.toString(input)).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(beautifulDays(20, 23, 6) == 2);
    }

}
