package org.fouda.solutions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Solution {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        int firstCatLocation = getLocation(x, z);
        int secondCatLocation = getLocation(y, z);
        if (firstCatLocation == secondCatLocation) {
            return "Mouse C";
        } else if (firstCatLocation > secondCatLocation) {
            return "Cat B";
        } else {
            return "Cat A";
        }

    }

    private static int getLocation(int catLocation, int mouseLocation) {
        return Math.abs(catLocation - mouseLocation);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);

            String result = catAndMouse(x, y, z);

            bufferedWriter.write(result);
            bufferedWriter.newLine();


        }

        bufferedWriter.close();

        scanner.close();
    }
}
