package com.abdoa.projecteuler;

import java.util.*;

public class Problem_23_AbundantNumber {

    public static void main(String[] args) {
        List<Integer> abundantNumbers = new ArrayList<>();
        Set<Integer> sumOfAbdNumb = new HashSet<>();
        for(int n=2; n<= 28123; n++){
            int sumOfDivisors = getSumOfDivisors(n);
            if(sumOfDivisors > n){
                abundantNumbers.add(n);
                for(int i=0; i<abundantNumbers.size(); i++){
                    if(abundantNumbers.get(i)+ n <= 28123){
                        sumOfAbdNumb.add(abundantNumbers.get(i)+ n);
                    }
                }
            }
        }
        System.out.println(abundantNumbers);
        System.out.println(sumOfAbdNumb);
        long sum =0;
        for(int i=1; i<=28123; i++){
            if(!sumOfAbdNumb.contains(i)){
                sum+=i;
            }
        }
        System.out.println(sum);
    }

    private static int getSumOfDivisors(int n) {
        int sumOfDivisors=0;
        for(int i= 1; i<= n/2; i++){
            if(n%i== 0){
                sumOfDivisors+=i;
            }
        }
        return sumOfDivisors;
    }
}
