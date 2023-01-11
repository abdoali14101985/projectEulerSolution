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
        long sum =triangle.get(0).get(0);
        int index = 0;
        int down=-1, left=-1, right=-1;

        for(int i=1; i< triangle.size(); i++){
            long downSum=0, leftSum=0, rightSum=0;
            //checking adjecent index of nextRow
            if(index >= 0){
                downSum = sum+ triangle.get(i).get(index);
                rightSum = sum+ triangle.get(i).get(index+1);
            }else {
                downSum = sum + triangle.get(i).get(index);
                rightSum = sum + triangle.get(i).get(index+1);
                leftSum = sum + triangle.get(i).get(index-1);
            }
            if(downSum > leftSum  && downSum > rightSum){
                sum = sum+ triangle.get(i).get(index);
            } else if (leftSum > downSum && leftSum > rightSum){
                sum = sum+ triangle.get(i).get(index-1);
                index = index-1;
            }else {
                sum = sum+ triangle.get(i).get(index+1);
                index = index+1;
            }
        }
        System.out.println(sum);
    }
}
