package org.fouda.solutions;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static java.util.stream.IntStream.of;

// Find the smallest positive integer that does not occur in a given sequence.
public class MissingInteger {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 6, 4, 1, 2}) == 5);
    }

    public static int solution(int[] A) {
        List<Integer> sortedList = of(A).filter(i -> i > 0).distinct().sorted().boxed().collect(toList());
        int result = 1;
        for (int element : sortedList) {
            if (element > result)
                return result;
            else result++;
        }
        return result;
    }
}
