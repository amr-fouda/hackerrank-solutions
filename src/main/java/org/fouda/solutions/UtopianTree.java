package org.fouda.solutions;

public class UtopianTree {

    // Complete the utopianTree function below.
    static int utopianTree(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                result = 1;
            } else if (i % 2 == 0) {
                result = result + 1;
            } else {
                result = result * 2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(utopianTree(0) == 1);
        System.out.println(utopianTree(1) == 2);
        System.out.println(utopianTree(2) == 3);
        System.out.println(utopianTree(3) == 6);
        System.out.println(utopianTree(4) == 7);
        System.out.println(utopianTree(5) == 14);
    }
}
