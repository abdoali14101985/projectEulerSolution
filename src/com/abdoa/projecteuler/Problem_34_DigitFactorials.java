package com.abdoa.projecteuler;

import java.util.HashMap;
import java.util.Map;

public class Problem_34_DigitFactorials {

    public static void main(String[] args) {
        Map<Character, Integer> digitFactorial = new HashMap<>();
        digitFactorial.put('0', 1);
        digitFactorial.put('1', 1);
        digitFactorial.put('2', 2);
        digitFactorial.put('3', 6);
        digitFactorial.put('4', 24);
        digitFactorial.put('5', 120);
        digitFactorial.put('6', 720);
        digitFactorial.put('7', 5040);
        digitFactorial.put('8', 40320);
        digitFactorial.put('9', 362880);
        //409113

        for(int i=10; i<= 9999999; i++){
            String numString = String.valueOf(i);
            int sumOfDigitsFactorial = 0;
            for (int j = 0; j < numString.length(); j++) {
                sumOfDigitsFactorial+= digitFactorial.get(numString.charAt(j));
            }
            if(sumOfDigitsFactorial == i){
                System.out.println(i);
            }

        }
    }
}
