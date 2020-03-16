package org.fouda.solutions;

import java.util.stream.IntStream;

public class MinimumAbsoluteDifference {
    // Complete the minimumAbsoluteDifference function below.
    static int minimumAbsoluteDifference(int[] arr) {
        int[] sorted = IntStream.of(arr).sorted().toArray();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < sorted.length - 1; i++) {
            int abs = Math.abs(sorted[i] - sorted[i + 1]);
            if (min > abs)
                min = abs;
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(minimumAbsoluteDifference(new int[]{-2, 2, 4}) == 2);
        System.out.println(minimumAbsoluteDifference(new int[]{3, -7, 0}) == 3);
        System.out.println(minimumAbsoluteDifference(new int[]{-59, -36, -13, 1, -53, -92, -2, -96, -54, 75}) == 1);
        System.out.println(minimumAbsoluteDifference(new int[]{1, -3, 71, 68, 17}) == 3);
    }
}
