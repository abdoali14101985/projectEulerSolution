package com.abdoa.projecteuler;

public class Problem_7_NthPrimeNumber {

    public static void main(String[] args) {
        int n = 10001;
        getNthPrimeNumber(n);
    }

    private static void getNthPrimeNumber(int n) {
        int counter = 0;
        for (int i = 2; i > 1; i++) {
            if (isPrime(i)) {
                counter++;
            }
            if (counter == n) {
                System.out.println(i);
                break;
            }
        }
    }

    private static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n > 2 && n % 2 == 0) {
            return false;
        } else {
            long sqrt = (long) Math.sqrt((double) n);
            boolean flag = true;
            for (long i = 3; i <= sqrt; i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return true;
            } else {
                return false;
            }
        }
    }

}
