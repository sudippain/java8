package com.feature.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.IntStream;

public class PrimeNumber {
    public static void main(String[] args) {
		
    	Scanner s = new Scanner(System.in);
		/* System.out.println("Enter Integer from a Keyboard"); */
    	int number = 4;
        
    	IntStream.range(2, number/2).forEach(System.out::println);
    	boolean b = IntStream.range(2, number/2).noneMatch(i -> number%i == 0);
    	if(b)
    		System.out.println("Prime");
    	else
    		System.out.println("Not Prime");
    	
    	
		
		
	}
}
