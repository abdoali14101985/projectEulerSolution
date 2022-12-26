package com.abdoa.projecteuler;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Problem_16_PowerDigitSum {

    public static void main(String[] args) {
        BigInteger number = BigInteger.TWO;
        BigInteger nthPower = number.pow(1000);
        System.out.println(nthPower);
        String nthPowerString = String.valueOf(nthPower);
        System.out.println(nthPowerString);
        int sum=0;
        for(int i=0; i<nthPowerString.length(); i++){
            String digit = String.valueOf(nthPowerString.charAt(i));
            sum+= Integer.parseInt(digit);
        }
        System.out.println(sum);
    }
}
