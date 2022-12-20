package com.abdoa.projecteuler;

public class Problem_6_SumOfSquares {

    public static void main(String[] args) {
        int limit = 10;
        printSumOfSquaresDifference(limit);
    }

    private static void printSumOfSquaresDifference(int limit) {
        long sumOfValues = (limit * (limit+1))/2;
        long squareOfSum = sumOfValues * sumOfValues;
        long sumOfSquares = (limit * (limit+1) * ((2*limit)+1))/6;
        /*for (int i=1; i<=limit; i++){
            sumOfSquares+= (i*i);
        }*/
        System.out.println(squareOfSum - sumOfSquares);
    }
}
