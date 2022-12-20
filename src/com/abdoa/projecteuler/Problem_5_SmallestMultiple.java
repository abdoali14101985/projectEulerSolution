package com.abdoa.projecteuler;

public class Problem_5_SmallestMultiple {
    public static void main(String[] args) {
        int limit = 2;
        int[] array = new int[limit];
        for(int i =0; i<limit; i++){
            array[i]= i+1;
        }
        array[0] = 4;
        array[1] =18;

        long smallestMultiple = getSmallestMultiple(array);
        System.out.println(smallestMultiple);
    }

    private static long getSmallestMultiple(int[] array) {
        long lcmOfArrayElements = 1;
        int divisor = 2;
        while (true){
            int counter =0;
            boolean divisible = false;
            for (int i=0; i < array.length; i++){
                if(array[i] == 0){
                    lcmOfArrayElements = 0;
                }
                if (array[i]< 0){
                    array[i] = array[i] * (-1);
                }
                if(array[i] == 1){
                    counter++;
                }
                if (array[i] % divisor == 0) {
                    divisible = true;
                    array[i] = array[i] / divisor;
                }

            }
            if (divisible) {
                lcmOfArrayElements = lcmOfArrayElements * divisor;
            }
            else {
                divisor++;
            }

            // Check if all element_array is 1 indicate
            // we found all factors and terminate while loop.
            if (counter == array.length) {
                return lcmOfArrayElements;
            }
        }
    }


}
