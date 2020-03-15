package org.fouda.solutions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MarkAndToys {
    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {
        List<Integer> sortedPrices = IntStream.of(prices).boxed().filter(i -> i <= k).sorted().collect(Collectors.toList());
        int sum = 0, count = 0;
        for (int price : sortedPrices) {
            if (sum + price <= k) {
                sum = sum + price;
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(maximumToys(new int[]{1, 12, 5, 111, 200, 1000, 10}, 50) == 4);
    }
}
