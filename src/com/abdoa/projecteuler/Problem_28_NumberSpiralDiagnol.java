package com.abdoa.projecteuler;

import java.util.ArrayList;
import java.util.List;

public class Problem_28_NumberSpiralDiagnol {

    public static void main(String[] args) {
        List<Integer> spiral = new ArrayList<>();
        for (int i = 0; i < 1001*1001; i++) {
            spiral.add(i+1);
        }
        System.out.println(spiral);
        long sum = spiral.get(0);
        int index=0;
        int count = 2;
        while(index < spiral.size()-1){
            for(int i=0; i<4; i++){
                index+= count;
                sum+=spiral.get(index);
            }
            count+=2;
        }
        System.out.println(sum);
    }
}
