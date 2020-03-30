package org.fouda.solutions;

import java.util.*;

public class JimOrders {
    // Complete the jimOrders function below.
    static int[] jimOrders(int[][] orders) {
        SortedSet<Integer> ordersEstimation = new TreeSet<>();
        Map<Integer, List<Integer>> m = new HashMap<>();
        for (int i = 0; i < orders.length; i++) {
            int orderDeliveryTime = orders[i][0] + orders[i][1];
            ordersEstimation.add(orderDeliveryTime);
            List<Integer> l = Optional.ofNullable(m.get(orderDeliveryTime)).orElse(new ArrayList<>());
            l.add(i + 1);
            m.put(orderDeliveryTime, l);
        }
        return ordersEstimation.stream().flatMap(r -> m.get(r).stream()).mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[][] input1 = {{1, 3}, {2, 3}, {3, 3}};
        System.out.println(Arrays.equals(new int[]{1, 2, 3}, jimOrders(input1)));
        int[][] input2 = new int[][]{{8, 1}, {4, 2}, {5, 6}, {3, 1}, {4, 3}};
        System.out.println(Arrays.equals(new int[]{4, 2, 5, 1, 3}, jimOrders(input2)));
    }
}
