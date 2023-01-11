package com.abdoa.projecteuler;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Problem_21_AmicableNumbers {

    public static void main(String[] args) {
        Set<Integer> amicableNumbers = new LinkedHashSet<>();
        int sum = 0;
        /*int sumOfDivisors = getSumDivisors(6);
        int sumOfDivisorsOfDivisors = getSumDivisors(sumOfDivisors);
        if(sumOfDivisorsOfDivisors == 6){
            amicableNumbers.add(6);
            amicableNumbers.add(sumOfDivisors);
        }*/
        for(int i=2;i<=100000;i++){
            int sumOfDivisors = getSumDivisors(i);
            int sumOfDivisorsOfDivisors = getSumDivisors(sumOfDivisors);
            if(sumOfDivisors!= i && sumOfDivisorsOfDivisors == i){
                amicableNumbers.add(i);
                amicableNumbers.add(sumOfDivisors);
            }

        }
        for (Integer val : amicableNumbers) {
            sum+= val;

        }
        System.out.println(amicableNumbers);
        System.out.println(sum);
    }

    private static int getSumDivisors(int n) {
        int result = 0;
        for(int i=1; i<=n/2; i++){
            if(n%i==0){
                result+=i;
            }
        }
        return result;
    }
}
