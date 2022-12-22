package com.abdoa.projecteuler;

public class Problem_10_SummationOfPrimes {

    public static void main(String[] args) {
        long sumOfPrimes = 0;
        for(long n = 2;n<2000000; n++){
            if(isPrime(n)){
                sumOfPrimes+= n;
            }
        }
        System.out.println(sumOfPrimes);
    }

    public static boolean isPrime(long n) {
        if(n==1) {
            return false;
        }else if(n==2) {
            return true;
        }else if(n>2 && n%2==0) {
            return false;
        }else {
            long sqrt=(long) Math.sqrt((double)n);
            boolean flag=true;
            for(long i=3;i<=sqrt;i++) {
                if(n%i==0) {
                    flag=false;
                    break;
                }
            }
            return flag;
        }
    }
}
