package org.fouda.solutions;

import java.io.IOException;
import java.util.Scanner;

class MinimumLoss {
    // Complete the minimumLoss function below.
    static int minimumLoss(long[] price) {
        long min = Long.MAX_VALUE;
        for (int i = 0; i < price.length; i++) {
            for (int y = i + 1; y < price.length; y++) {
                long loss = price[i] - price[y];
                if (loss > 0 && min > loss) {
                    min = loss;
                }
            }

        }
        return (int) min;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        assert 2 == minimumLoss(new long[]{20, 7, 8, 2, 5});
        assert 2 == minimumLoss(new long[]{5, 10, 3});
    }
}
