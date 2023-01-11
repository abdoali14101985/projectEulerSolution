package com.abdoa.projecteuler;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Problem_15_LatticePaths {

    public static void main(String[] args) {
        int gridSize = 20;
        findLatticePaths(gridSize);
    }

    private static void findLatticePaths(int gridSize) {
       // Lattice path calculation can be done by finding binomial coefficeient
        // of nCr  n= 2xgridSize & r= gridSize; fact(n)/fact(r)*fact(n-r);
        BigInteger result = BigInteger.ONE;
        BigInteger factorialN = factorial(2*gridSize);
        BigInteger factorialR = factorial(gridSize);
        BigInteger factorialDifference = factorial((2*gridSize) - gridSize);
        System.out.println(factorialN.divide(factorialR.multiply(factorialDifference)));

    }

    private static BigInteger factorial(int n){
        if (n<= 1){
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(factorial(n-1));
    }
}
