package org.fouda.tricks;

import java.util.Set;
import java.util.TreeSet;

public class Divisor {
    public static void main(String[] args) {
        System.out.println(getDivisorList(36));//1,2,3,4,6,9,12,18,36

        System.out.println(getDivisorList(36).size() == 9);
        System.out.println(getDivisorList(112).size() == 10);
        System.out.println(getDivisorCount(36) == 9 && getDivisorCount1(36) == 9);
        System.out.println(getDivisorList(13).size() == 2);
        System.out.println(getDivisorCount(11) == 2);
        System.out.println(getDivisorCount(7) == 2);
        System.out.println(getDivisorCount(6) == 4);
        System.out.println(getDivisorCount(36) == 9);


        System.out.println(isPrime(6) == false);
        System.out.println(isPrime(13) == true);
    }

    //O(√n)
    public static Set<Integer> getDivisorList(int n) {
        Set<Integer> list = new TreeSet<>();//Set is needed to remove duplicates
        // Note that this loop runs till square root
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                list.add(i);
                list.add(n / i);
            }
        }
        return list;
    }

    /**
     * We can find the symmetric divisor. More precisely, if number a is a divisor of n, then n/a sis also a divisor.
     * One of these two divisors is less than or equal to √n.
     * Thus, iterating through all the numbers from 1 to √n allows us to find all the divisors. If
     * number n is of the form k pow 2, then the symmetric divisor of k is also k.
     *
     * @param n
     * @return
     */
    //O(√n)
    public static int getDivisorCount(int n) {
        int i = 1; //start
        int result = 0;//init result
        while (i * i < n) { //loop in number and it's multiplier
            if (n % i == 0) //if number is dividable
                result = result + 2; // increase count by number and it's multiplier as it is within the range
            i++;//Move next
        }
        if (i * i == n) //If N was equal to i*i -> count the number once
            result++;
        return result;
    }

    //Classic O(N) checking all elements.
    public static int getDivisorCount1(int N) {
        int result = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) result++;
        }
        return result;
    }

    //O(√n)
    public static boolean isPrime(int n) {
        int i = 2;
        while (i * i <= n) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
