package com.abdoa.projecteuler;

import java.util.HashMap;
import java.util.Map;

public class Problem_17_NumberLetterCounts {

    public static Map<String, Integer> digitLetterCount = new HashMap<>();

    public static void main(String[] args) {
        digitLetterCount.put("1",3);
        digitLetterCount.put("2",3);
        digitLetterCount.put("3",5);
        digitLetterCount.put("4",4);
        digitLetterCount.put("5",4);
        digitLetterCount.put("6",3);
        digitLetterCount.put("7",5);
        digitLetterCount.put("8",5);
        digitLetterCount.put("9",4);
        digitLetterCount.put("10",3);
        digitLetterCount.put("11",6);
        digitLetterCount.put("12",6);
        digitLetterCount.put("13",8);
        digitLetterCount.put("14",8);
        digitLetterCount.put("15",7);
        digitLetterCount.put("16",7);
        digitLetterCount.put("17",9);
        digitLetterCount.put("18",8);
        digitLetterCount.put("19",8);
        digitLetterCount.put("20",6);
        digitLetterCount.put("30",6);
        digitLetterCount.put("40",5);
        digitLetterCount.put("50",5);
        digitLetterCount.put("60",5);
        digitLetterCount.put("70",7);
        digitLetterCount.put("80",6);
        digitLetterCount.put("90",6);
        //digitLetterCount.put("100",10);
        //digitLetterCount.put("200",10);
        //digitLetterCount.put("300",12);
        //digitLetterCount.put("400",11);
        //digitLetterCount.put("500",11);
        //digitLetterCount.put("600",10);
        //digitLetterCount.put("700",12);
        //digitLetterCount.put("800",12);
        //digitLetterCount.put("900",11);
        //digitLetterCount.put("1000",11);
        long totalLetterCount = 0;
        for(int i=1; i<=1000; i++){
            totalLetterCount+= getLetterCountOfNumber(i);
        }
        System.out.println(totalLetterCount);
    }

    private static long getLetterCountOfNumber(int number) {
        long letterCount=0;
        String numberString = String.valueOf(number);
        int stringLength = numberString.length();
        if(digitLetterCount.containsKey(numberString)){
            return digitLetterCount.get(numberString);
        }
        for(int i=0; i< stringLength-1; i++){
            if(stringLength - i == 4){
                //System.out.println("Thousand digit: "+ numberString.substring(i,i+1));
                letterCount+= digitLetterCount.get(numberString.substring(i,i+1));
                letterCount+=8;
            }
            if(stringLength-i == 3){
                //System.out.println("Hundredth digit: "+ numberString.substring(i,i+1));
                if(numberString.charAt(i) != '0'){
                    letterCount+= digitLetterCount.get(numberString.substring(i,i+1));
                    letterCount+= 7;
                }
            }
            if(stringLength-i == 2){
                //System.out.println("Last two digit: "+ numberString.substring(i));
                if(!numberString.substring(i).equals("00")){
                    int lastTwoDigitNumber = Integer.parseInt(numberString.substring(i));
                    String lastTwoDigitString = String.valueOf(lastTwoDigitNumber);
                    if(letterCount > 0){
                        letterCount+= 3; // adding letter count of 'and' only when number is more than 3 digit number
                    }

                    if(digitLetterCount.containsKey(lastTwoDigitString)){
                        letterCount+= digitLetterCount.get(lastTwoDigitString);
                    }else {
                        int tenDigit = Integer.parseInt(lastTwoDigitString.substring(0,1));
                        letterCount+= digitLetterCount.get(String.valueOf(tenDigit*10));
                        letterCount+= digitLetterCount.get(lastTwoDigitString.substring(1));
                    }

                }

            }

        }

        return letterCount;
    }
}
