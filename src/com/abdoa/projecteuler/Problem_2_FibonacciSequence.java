package com.abdoa.projecteuler;

public class Problem_2_FibonacciSequence {

    public static void main(String[] args) {
        getSumofEvenValuesFibonacciSequence(4000000);
    }

    private static void getSumofEvenValuesFibonacciSequence(int limit) {
        long previousTerm = 1;
        long currentTerm = 2;
        long nextTerm;
        long sumOfEvenTerms = 2;
        while(previousTerm+currentTerm < limit){
            nextTerm = currentTerm + previousTerm;
            if(nextTerm % 2 == 0){
                sumOfEvenTerms+= nextTerm;
            }
            previousTerm = currentTerm;
            currentTerm = nextTerm;
        }
        System.out.println(sumOfEvenTerms);
    }
}
