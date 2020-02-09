package org.fouda.solutions;

public class ElectronicsShop {
    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int spent = -1;
        for (int keyboard : keyboards) {
            for (int drive : drives) {
                if (keyboard + drive <= b && keyboard + drive > spent) {
                    spent = keyboard + drive;
                }
            }
        }
        return spent;
    }
}
