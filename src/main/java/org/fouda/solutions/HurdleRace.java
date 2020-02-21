package org.fouda.solutions;

import java.util.stream.IntStream;

public class HurdleRace {
    // Complete the hurdleRace function below.
    static int hurdleRace(int k, int[] height) {
        int max = IntStream.of(height).max().orElse(0);
        return (max > k) ? (max - k) : (0);
    }

}
