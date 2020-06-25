package org.fouda.tricks;

public class MaxSlice {
    //You are given a sequence of n integers
    //a0, a1, . . . , an−1 and the task is to find the slice with the largest sum
    public static void main(String[] args) {
        //Option1 - O(n+n2) ~ O(n2)
        int[] arr = {5, -7, 3, 5, -2, 4, -1};
        int[] prefix = generatePrefixSum(arr);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int y = i + 1; y < arr.length; y++) {
                int rangeSum = prefix[y + 1] - prefix[i];
                if (max < rangeSum)
                    max = rangeSum;
            }
        }
        System.out.println(max);


        //Option2 - O(n)
        int maxEnding = 0, maxSlice = 0;
        for (int i = 0; i < arr.length; i++) {
            maxEnding = Math.max(0, maxEnding + arr[i]);
            maxSlice = Math.max(maxSlice, maxEnding);
        }
        System.out.println(maxSlice);

    }

    public static int[] generatePrefixSum(int[] arr) {
        int[] prefix = new int[arr.length + 1];
        prefix[0] = 0;
        int i = 1;
        for (int element : arr) {
            prefix[i] = element + prefix[i - 1];
            i++;
        }
        return prefix;
    }

}
