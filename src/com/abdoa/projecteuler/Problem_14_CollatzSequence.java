package com.abdoa.projecteuler;

import java.util.HashMap;
import java.util.Map;

public class Problem_14_CollatzSequence {

    public static void main(String[] args) {
        long maxTerms = Long.MIN_VALUE;
        Map<Long, Long> termsCount = new HashMap<>();
        for(long n=1000000; n>=2; n--){
            long terms = getCollatzSequence(n);
            termsCount.put(terms,n);
            maxTerms = Math.max(maxTerms, terms);
        }
        System.out.println(termsCount.get(maxTerms));
    }

    private static long getCollatzSequence(long n) {
        long counter = 1;
        while(n>1){
            //System.out.print(n+ "->");
            counter++;
            if(n%2==0){
                n= n/2;
            }else {
                n = (3*n)+1;
            }
        }
        //System.out.print(n);
        //System.out.println();
        //System.out.println(counter);
        return counter;
    }
}
