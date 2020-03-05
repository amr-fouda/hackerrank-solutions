package org.fouda.solutions;

import java.util.Arrays;
import java.util.List;

public class MigratoryBirds {
    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        int[] type = new int[5];
        for (int number : arr) {
            type[number - 1] = type[number - 1] + 1;
        }
        int index = 0;
        int max = type[0];
        for (int i = 1; i < type.length; i++) {
            if (type[i] > max) {
                max = type[i];
                index = i;
            }
        }
        return index + 1;
    }

    public static void main(String[] args) {
        System.out.println(3 == migratoryBirds(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)));
        System.out.println(4 == migratoryBirds(Arrays.asList(1, 4, 4, 4, 5, 3)));
    }
}
