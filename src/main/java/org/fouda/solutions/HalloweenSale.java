package org.fouda.solutions;

public class HalloweenSale {
    // Complete the howManyGames function below.
    static int howManyGames(int p, int d, int m, int s) {
        int rate = p;
        int count = 0;
        while (true) {
            if (s - rate >= 0) {
                s = s - rate;
                count++;
            } else {
                break;
            }
            rate = getRate(rate, d, m);
        }
        return count;
    }

    private static int getRate(int oldRate, int d, int m) {
        int rate;
        if (oldRate - d <= m || oldRate - d <= 0) {
            rate = m;
        } else {
            rate = oldRate - d;
        }
        return rate;
    }

    public static void main(String[] args) {
        System.out.println(howManyGames(20, 3, 6, 80) == 6);
        System.out.println(howManyGames(20, 3, 6, 85) == 7);
        System.out.println(howManyGames(16, 2, 1, 9981) == 9917);
        System.out.println(howManyGames(100, 1, 1, 99) == 0);
        System.out.println(howManyGames(98, 81, 22, 998) == 41);
    }
}
