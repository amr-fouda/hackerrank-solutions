package org.fouda.solutions;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ServiceLane {
    private static final Scanner scanner = new Scanner(System.in);

    // Complete the serviceLane function below.
    static int[] serviceLane(int n, int[][] cases, int[] width) {
        int[] result = new int[cases.length];
        for (int i = 0; i < cases.length; i++) {
            result[i] = getRange(width, cases[i][0], cases[i][1]);
        }
        return result;
    }

    static int getRange(int[] width, int start, int end) {
        return IntStream.of(Arrays.copyOfRange(width, start, end + 1)).min().getAsInt();
    }

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nt = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nt[0]);

        int t = Integer.parseInt(nt[1]);

        int[] width = new int[n];

        String[] widthItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int widthItem = Integer.parseInt(widthItems[i]);
            width[i] = widthItem;
        }

        int[][] cases = new int[t][2];

        for (int i = 0; i < t; i++) {
            String[] casesRowItems = scanner.nextLine().split(" ");

            for (int j = 0; j < 2; j++) {
                int casesItem = Integer.parseInt(casesRowItems[j]);
                cases[i][j] = casesItem;
            }
        }

        int[] result = serviceLane(n, cases, width);
        for (int element : result)
            System.out.println(element);
    }
}
