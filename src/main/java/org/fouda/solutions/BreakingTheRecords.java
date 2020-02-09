package org.fouda.solutions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BreakingTheRecords {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
        int low = 0;
        int max = 0;
        int lowCounter = 0;
        int maxCounter = 0;
        for (int i = 0; i < scores.length; i++) {
            if (i == 0) {
                low = max = scores[i];
            } else {
                if (low > scores[i]) {
                    lowCounter++;
                    low = scores[i];
                }
                if (max < scores[i]) {
                    maxCounter++;
                    max = scores[i];
                }
            }

        }
        return new int[]{maxCounter, lowCounter};
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
