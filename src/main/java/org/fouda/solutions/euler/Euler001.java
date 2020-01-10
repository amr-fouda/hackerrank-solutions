package org.fouda.solutions.euler;

import java.util.*;

public class Euler001 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        TreeSet<Integer> inputTree = new TreeSet<>();
        List<Integer> inputList = new ArrayList<>();
        Map<Integer,Integer> cache = new HashMap<>();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            inputList.add(n);
            inputTree.add(n);
        }
        int max = inputTree.pollLast();
        int sum = 0;
        for (int y = 1; y < max; y++) {
            cache.put(y,sum);
            if (y % 3 == 0 || y % 5 == 0) {
                sum = sum + y;
            }
        }
        cache.put(max,sum);
        inputList.stream().forEach(k -> System.out.println(cache.get(k)));
    }

    //Idea#1 - Cache results
    /*
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        Map<Integer, Integer> cache = new HashMap<>();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int result = 0;
            if (cache.containsKey(n)) {
                result = cache.get(n);
            } else {
                int start = cache.keySet().parallelStream().filter(e -> e < n).sorted(Collections.reverseOrder()).findFirst().orElse(1);
                int value = cache.getOrDefault(start,0);
                result = getSumOfNumbersThatAreMultipliedByThreeOrFive(n,start,value);
            }
            System.out.println(result);
        }
    }

    public static int getSumOfNumbersThatAreMultipliedByThreeOrFive(int n,int start,int cache) {
        int sum = cache;
        for (int y = start; y < n; y++) {
            if (y % 3 == 0 || y % 5 == 0) {
                sum = sum + y;
            }
        }
        return sum;
    }
     */
}
