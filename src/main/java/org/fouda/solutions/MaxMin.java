package org.fouda.solutions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MaxMin {
    // Complete the maxMin function below.
    static int maxMin(int k, int[] arr) {
        int min = Integer.MAX_VALUE;
        List<Integer> sortedArr = IntStream.of(arr).boxed().sorted().collect(Collectors.toList());
        for (int i = 0; i < sortedArr.size() - k +1 ; i++) {
            int temp = calculateUnfairness(sortedArr.subList(i,i+k));
            if (min > temp) {
                min = temp;
            }
        }
        return min;
    }

    static int calculateUnfairness(List<Integer> sortedList) {
        return sortedList.get(sortedList.size() - 1) - sortedList.get(0);
    }

    public static void main(String[] args) {
        System.out.println(maxMin(2, new int[]{1, 4, 7, 2})==1);
        System.out.println(maxMin(3, new int[]{10,100,300,200,1000,20,30})==20);
        System.out.println(maxMin(2, new int[]{1,2,1,2,1})==0);
        System.out.println(maxMin(3, new int[]{100,200,300,350,400,401,402})==2);
    }
}
