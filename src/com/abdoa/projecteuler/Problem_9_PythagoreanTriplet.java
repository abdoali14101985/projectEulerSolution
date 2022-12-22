package com.abdoa.projecteuler;

public class Problem_9_PythagoreanTriplet {

    public static void main(String[] args) {
        for(int a = 1; a <1000; a++){
            for (int b=1; b <1000; b++){
                for (int c=1; c <1000; c++){
                    if(a<b && b<c && (a*a + b*b) == (c * c) && a+b+c  == 1000){
                        System.out.println(a+" "+ b + " "+ c);
                        System.out.println(a*b*c);
                        break;
                    }

                }
            }
        }
    }
}
