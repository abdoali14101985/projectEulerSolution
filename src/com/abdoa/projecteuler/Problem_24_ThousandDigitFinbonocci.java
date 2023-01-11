package com.abdoa.projecteuler;

import java.math.BigInteger;

public class Problem_24_ThousandDigitFinbonocci {

    public static void main(String[] args) {
        int index = 3;
        BigInteger tPrev = BigInteger.ONE;
        BigInteger tCurr = BigInteger.TWO;
        do{
            BigInteger temp = tCurr;
            tCurr = tPrev.add(tCurr);
            tPrev = temp;
            index++;
        }while(tCurr.toString().length()!= 1000);
        System.out.println(index);
    }
}
