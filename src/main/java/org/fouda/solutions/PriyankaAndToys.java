package org.fouda.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PriyankaAndToys {
    // Complete the toys function below.
    static int toys(int[] w) {
        List<Integer> sortedArr = IntStream.of(w).boxed().sorted().collect(Collectors.toList());
        int containerCount = 0, min = Integer.MIN_VALUE;
        List<Integer> container = new ArrayList<>();
        for (int itemWeight : sortedArr) {
            if (itemWeight > (min + 4)) {
                container.clear();
                container.add(itemWeight);
                min = itemWeight;
                containerCount++;
            } else {
                container.add(itemWeight);
            }
        }
        return containerCount;
    }

    public static void main(String[] args) {
        System.out.println(toys(new int[]{1, 2, 3, 21, 7, 12, 14, 21}) == 4);
        System.out.println(toys(new int[]{1, 2, 3, 4, 5, 10, 11, 12, 13}) == 2);
    }
}
