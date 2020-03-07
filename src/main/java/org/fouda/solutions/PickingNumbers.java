package org.fouda.solutions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PickingNumbers {
    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        List<Integer> sortedNumbers = a.parallelStream().sorted().collect(Collectors.toList());
        int subsetCount = 0;
        int currentSubsetCount = 1;
        int currentElement = -1;
        for (int element : sortedNumbers) {
            if (currentElement == element || Math.abs((element - currentElement)) <= 1) {
                currentSubsetCount++;
            } else {
                currentElement = element;
                currentSubsetCount = 1;
            }
            if (currentSubsetCount > subsetCount) {
                subsetCount = currentSubsetCount;
            }
        }
        return subsetCount;
    }

    public static void main(String[] args) {
        System.out.println(pickingNumbers(Arrays.asList(1, 2, 2, 3, 1, 2)) == 5);
        System.out.println(pickingNumbers(Arrays.asList(98, 3, 99, 1, 97, 2)) == 2);
        System.out.println(pickingNumbers(Arrays.asList(1, 1, 1)) == 3);
    }
}
