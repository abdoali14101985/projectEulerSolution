package com.abdoa.projecteuler;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Problem_19_Sundays {

    public static void main(String[] args) {
        LocalDate date;
        int counter=0;
        for(int year=1901; year <= 2000; year++){
            for(int month=1; month<=12; month++){
                date= LocalDate.of(year, month, 1);
                if(date.getDayOfWeek().equals(DayOfWeek.SUNDAY)){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
