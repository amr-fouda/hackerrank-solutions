package org.fouda.solutions;

public class MarsExploration {
    final static String SOS_MESSAGE = "SOS";

    // Complete the marsExploration function below.
    static int marsExploration(String s) {
        int index = 0;
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c != SOS_MESSAGE.charAt(index)) {
                count++;
            }
            index++;
            if (index == SOS_MESSAGE.length())
                index = 0;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(marsExploration("SOSTOT") == 2);
        System.out.println(marsExploration("SOSSPSSQSSOR") == 3);
        System.out.println(marsExploration("SOSSOT") == 1);
        System.out.println(marsExploration("SOSSOSSOS") == 0);
    }
}
