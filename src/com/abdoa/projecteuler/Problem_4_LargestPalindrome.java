package com.abdoa.projecteuler;

public class Problem_4_LargestPalindrome {
    public static void main(String[] args) {
        largestPalindrome();

    }

    private static void largestPalindrome() {
        long largestPalindrome = 0;
        long product =0;
        for(int i = 999; i>99; i--){
            for( int j = 999; j> 99; j--){
                product = i * j;
                if(isPalindrome(product)){
                    largestPalindrome = Math.max(largestPalindrome, product);
                }
            }
        }
        System.out.println(largestPalindrome);
    }

    private static boolean isPalindrome(long number) {
        return reverse(number) == number;
    }

    private static long reverse(long number) {
        long lastDigit;
        long reversedNumber =0;
        while(number>0){
            lastDigit = number % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            number/=10;
        }
        return reversedNumber;
    }
}
