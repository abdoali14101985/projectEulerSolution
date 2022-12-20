package com.abdoa.projecteuler;

import java.util.Set;
import java.util.TreeSet;

public class Problem_3_LargestPrimeFactor {

    public static void main(String[] args) {
        getLargestPrimeFactor(13195L);

    }

    private static void getLargestPrimeFactor(long number) {
        long divisor = 2;
        Set<Long> primeFactors = new TreeSet<>();
        while (number > 1) {
            if(number % divisor == 0 ){
                primeFactors.add(divisor);
                number/=divisor;
            } else {
                divisor++;
            }
        }
        System.out.println(primeFactors.stream().mapToLong(l -> l).max().getAsLong());
    }
}
