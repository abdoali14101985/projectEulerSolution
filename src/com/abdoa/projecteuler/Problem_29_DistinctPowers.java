package com.abdoa.projecteuler;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Problem_29_DistinctPowers {
    public static void main(String[] args) {
        Set<BigInteger> powers = new TreeSet<>();
        for(long i=2;i <= 100; i++){
            for(int j=2; j<=100; j++){
                BigInteger value = BigInteger.valueOf(i).pow(j);
                powers.add(value);
            }
        }
        System.out.println(powers.size());

    }

}
