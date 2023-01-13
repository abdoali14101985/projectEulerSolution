package com.abdoa.projecteuler;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Problem_24_LexicographicPermutations {
    static List<String> permutations = new ArrayList<>();

    public static void main(String[] args) {
        String str = "0123456789";
        int len = str.length();
        generatePermutations(str, 0, len);
        permutations.sort(Comparator.naturalOrder());
        System.out.println(permutations.get(1000000-1));
    }
    private static List<String> generatePermutations(String str, int start, int end) {

        if(start == end-1){
            permutations.add(str);
        }else {
            for (int i = start; i < end; i++) {
                str = swap(str, start, i); // swapping the string by fixing the character
                generatePermutations(str,start+1,end); //recursive call to generate rest of permutations
                str = swap(str,start,i); //backtracking to original str
            }
        }
        return permutations;
    }
    private static String swap(String a, int i, int j) {
        char[] b =a.toCharArray();
        char ch;
        ch =b[i];
        b[i] = b[j];
        b[j]= ch;
        return String.valueOf(b);
    }

}
