package org.fouda.tricks;

/*
 *Prefix sum is used to obtain the sum of continuous elements in an array in constant time.
 *The idea is to loop once on all the array elements O(n) then using a formula prefix[y+1]-prefix[x] to get the sum of elements between x and y.
 */
public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] prefix = generatePrefixSum(arr);
        System.out.println(prefix[3] - prefix[0]);//x=0 , y=2 [1,2,3] = 6
        System.out.println(prefix[4] - prefix[1]);//x=3 , y=1 [2,3,4] = 9
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
