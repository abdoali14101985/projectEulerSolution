package com.abdoa.projecteuler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class Problem_22_NameScores {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\abdoa\\LearnOCAWS\\ProjectEulerSolution\\src\\p022_names.txt");
        Scanner sc = new Scanner(file);
        String str = "";
        while(sc.hasNextLine()){
            str =sc.nextLine();
            //System.out.println(str);
        }
        List<String> names = Arrays.asList(str.split(","));
        List<String> list = names.stream().map(s-> s.replaceAll("\"", "")).collect(Collectors.toList());
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        long totalScore =0;
        for(int i=0; i< list.size(); i++){
            long multiplier = i+1;
            long nameScore = 0;
            String name = list.get(i);
            for(int j=0;j< name.length();j++){
                nameScore+= (name.charAt(j)-64);
            }
            nameScore = multiplier*nameScore;
            totalScore+=nameScore;
        }
        System.out.println(totalScore);

    }
}
