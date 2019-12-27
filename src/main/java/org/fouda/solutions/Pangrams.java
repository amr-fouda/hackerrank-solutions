package org.fouda.solutions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class PangramsSolution {
    private static final String PANGRAM = "pangram";
    private static final String NOT_PANGRAM = "not pangram";

    // Complete the pangrams function below.
    static String pangrams(String s) {
        return (s.toLowerCase().replace(" ", "").chars()
                .mapToObj(e -> (char) e)
                .distinct()
                .count() == 26 ? (PANGRAM) : (NOT_PANGRAM));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String test = "We promptly judged antique ivory buckles for the next prize";
        pangrams(test);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
