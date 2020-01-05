package org.fouda.solutions;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class BalancedSums {
    // Complete the balancedSums function below.
    //Big(O) = O(N+N+1) ~= O(N)
    static String balancedSums(List<Integer> arr) {
        if (arr.size() == 1) {
            return "YES";
        }
        Map<Integer, Long> asc = new HashMap<>();
        long temp = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (i == 0) {
                temp = arr.get(0);
                asc.put(0, 0l);
            } else {
                asc.put(i, temp);
                temp = temp + arr.get(i);
            }
        }
        Map<Integer, Long> desc = new HashMap<>();
        temp = 0;
        for (int i = arr.size() - 1; i >= 0; i--) {
            if (i == arr.size() - 1) {
                temp = arr.get(arr.size() - 1);
                desc.put(arr.size() - 1, 0l);
            } else {
                desc.put(i, temp);
                temp = temp + arr.get(i);
                if (desc.get(i).longValue() == asc.get(i).longValue()) {
                    return "YES";
                }
            }
        }
        return "NO";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, T).forEach(TItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

                String result = balancedSums(arr);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
