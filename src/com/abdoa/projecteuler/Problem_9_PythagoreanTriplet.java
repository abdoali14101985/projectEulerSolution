package com.abdoa.projecteuler;

public class Problem_9_PythagoreanTriplet {

    public static void main(String[] args) {
        for(int a = 3; a <1000; a++){
            for (int b=a+1; b <1000; b++){
                double c = Math.pow(a,2) + Math.pow(b,2);
                c = Math.sqrt(c);
                if(a+b+c == 1000) {
                    System.out.println(a + " " + b + " " + (int)c);
                    System.out.println((long) (a * b * c));
                    break;
                }
            }
        }
    }
}
