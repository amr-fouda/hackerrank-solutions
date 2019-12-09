package org.fouda.solutions.implementation;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import static java.util.stream.Collectors.*;

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
