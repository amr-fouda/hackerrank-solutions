package org.fouda.solutions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RotateArray {

    public static void main(String[] args) {
        System.out.println(Arrays.equals(solution(new int[]{3, 8, 9, 7, 6}, 3), new int[]{9, 7, 6, 3, 8}));
        System.out.println(Arrays.equals(solution(new int[]{0, 0, 0}, 1), new int[]{0, 0, 0}));
        System.out.println(Arrays.equals(solution(new int[]{1, 2, 3, 4}, 4), new int[]{1, 2, 3, 4}));


    }

    static public int[] solution(int[] A, int K) {
        List<Integer> list = IntStream.of(A).boxed().collect(Collectors.toList());
        Collections.rotate(list, K);
        return list.stream().mapToInt(i -> i).toArray();
    }
}
