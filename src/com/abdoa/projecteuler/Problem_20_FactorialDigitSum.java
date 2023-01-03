package com.abdoa.projecteuler;

import java.math.BigInteger;

public class Problem_20_FactorialDigitSum {

    public static void main(String[] args) {
        BigInteger factorial = BigInteger.ONE;
        for(int i =2; i<=100; i++){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);
        BigInteger digitSum = BigInteger.ZERO;
        while(factorial.compareTo(BigInteger.ZERO)>0){
            digitSum = digitSum.add(factorial.remainder(BigInteger.TEN));
            factorial = factorial.divide(BigInteger.TEN);
        }
        System.out.println(digitSum);
    }
}
