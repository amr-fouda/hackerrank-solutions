package org.fouda.solutions;

public class ViralAdvertising {
    public static void main(String[] args) {
        System.out.println(2 == viralAdvertising(1));
        System.out.println(5 == viralAdvertising(2));
        System.out.println(9 == viralAdvertising(3));
        System.out.println(15 == viralAdvertising(4));

    }

    // Complete the viralAdvertising function below.
    static int viralAdvertising(int n) {
        int result = 0;
        int count = 5;
        for (int i = 1; i <= n; i++) {
            result = result + count / 2;
            count = (count / 2) * 3;
        }
        return result;
    }

}
