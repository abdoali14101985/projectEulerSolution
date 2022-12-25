package com.abdoa.projecteuler;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Problem_12_TriangularNumber {

    public static void main(String[] args) {
        long triangularNumber;
        for( int i=1; i>0; i++){
            triangularNumber = (i * (i+1))/2;
            //Map<Long, Integer> primeFactors = getPrimeFactor(triangularNumber);
            int noOfDivisor = getNumberOfDivisor(triangularNumber);
            if(noOfDivisor > 500){
                System.out.println("No of divisor of " + triangularNumber + " are "+ noOfDivisor);
                break;
            }

        }
    }

    private static Map<Long, Integer> getPrimeFactor(long number) {
        long divisor = 2;
        Map<Long, Integer> primeFactors = new HashMap<>();
        while (number > 1) {
            if(number % divisor == 0 ){
                if(primeFactors.containsKey(divisor)){
                    primeFactors.put(divisor, primeFactors.get(divisor)+1);
                } else {
                    primeFactors.put(divisor, 1);
                }
                number/=divisor;
            } else {
                divisor++;
            }
        }
        return primeFactors;
    }

    private static int getNumberOfDivisor(long number) {
        int divisorsCount=1;
        Map<Long, Integer> primeFactors  = getPrimeFactor(number);
        Set<Long> keySet = primeFactors.keySet();
        for (Long key: keySet ) {
            divisorsCount*= primeFactors.get(key)+1;
        }
        return divisorsCount;
    }
}
