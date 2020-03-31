package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        List<Integer> integer = Arrays.asList(1, 2, 6, 4, 5, 6, 7, 8, 9, 10);
        int sum = integer.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum : " + sum);

        int sum1 = integer.stream().map(x ->x%2 ==0 ? x : (-x)).reduce((x,x1) -> x+x1).orElse(0);
        System.out.println("Sum 1 :"+sum1);


    }
}
