package com.abdoa.projecteuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Problem_18_MaximumPathSum {

    public static void main(String[] args) throws IOException {
        List<List<Integer>> triangle = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        IntStream.range(0, n).forEach(tItr -> {
            try {
                List<Integer> row = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());
                triangle.add(row);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        System.out.println(triangle);
        maximumPathSum(triangle);

    }

    private static void maximumPathSum(List<List<Integer>> triangle) {
        for(int i=triangle.size()-2; i>=0; i--){
            for(int j=0; j<triangle.get(i).size(); j++){
                triangle.get(i).set(j, triangle.get(i).get(j)+ Math.max(triangle.get(i+1).get(j),triangle.get(i+1).get(j+1)));

            }
        }
        System.out.println(triangle.get(0).get(0));

    }
}
