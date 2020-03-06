package org.fouda.solutions;

import java.util.Arrays;

public class FindMedian {
    // Complete the findMedian function below.
    static int findMedian(int[] arr) {
        Arrays.sort(arr);
        return arr[(arr.length / 2)];
    }

    public static void main(String[] args) {
        System.out.println(findMedian(new int[]{0, 1, 2, 4, 6, 5, 3}) == 3);
    }
}