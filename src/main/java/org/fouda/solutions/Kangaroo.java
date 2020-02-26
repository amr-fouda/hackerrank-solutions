package org.fouda.solutions;

public class Kangaroo {
    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        int min = Math.min(x1, x2);
        int max = Math.max(x1, x2);
        return jump(min + v1, v1, max + v2, v2);
    }

    static private String jump(int min, int v1, int max, int v2) {
        if (min == max) {
            return "YES";
        } else if (min > max || v1 <= v2) {
            return "NO";
        } else {
            return jump(min + v1, v1, max + v2, v2);
        }
    }

    public static void main(String[] args) {
        assert "NO".equalsIgnoreCase(kangaroo(0, 2, 5, 3));
        assert "YES".equalsIgnoreCase(kangaroo(0, 3, 4, 2));
        assert "NO".equalsIgnoreCase(kangaroo(43, 2, 70, 2));
    }
}
