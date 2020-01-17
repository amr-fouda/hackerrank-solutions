package org.fouda.solutions;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MissingNumbers {
    //O(2a+b) ~= O(a+b)
    static int[] missingNumbers(int[] arr, int[] brr) {
        Map<Integer,Integer> first= countIntegers(arr);
        Map<Integer,Integer> second= countIntegers(brr);
        return first.keySet().stream().mapToInt( i->i)
                .filter(i -> first.get(i).intValue() != second.getOrDefault(i,0))
                .sorted()
                .toArray();
    }
    public static Map<Integer,Integer> countIntegers(int[]arr)
    {
        return  IntStream.of(arr)
                .parallel()
                .boxed()
                .collect(Collectors.toMap( k -> k , v->1 , ( a,  b) -> a+b ));
    }

    public static void main(String[] args) {
        IntStream.of(missingNumbers(new int[]{1,1,2},new int[]{1,2,3}))
                .boxed()
                .forEach(System.out::println);
    }
}
