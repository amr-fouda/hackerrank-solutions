package org.fouda.solutions;

import java.util.*;

public class SalesByMatch {
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        final List<Integer> pairs = new ArrayList<>();
        Map<Integer, Integer> numbers = new HashMap<>();
        Arrays.stream(ar).forEach(number -> {
            if (numbers.containsKey(number)) {
                if (numbers.get(number) == 1) {
                    pairs.add(number);
                }
                numbers.remove(number);
            } else {
                numbers.put(number, 1);
            }
        });
        return pairs.size();
    }


    public static void main(String[] args) {
        System.out.println(3 == sockMerchant(9, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20}));
    }
}
