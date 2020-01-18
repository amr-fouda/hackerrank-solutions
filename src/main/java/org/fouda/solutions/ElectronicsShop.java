package org.fouda.solutions;

public class ElectronicsShop {
    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int spent = -1;
        for (int i = 0; i < keyboards.length; i++) {
            for (int y = 0; y < drives.length; y++) {
                if (keyboards[i] + drives[y] <= b && keyboards[i] + drives[y] > spent ) {
                    spent = keyboards[i] + drives[y];
                }
            }
        }
        return spent;
    }
}
