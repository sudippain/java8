package com.feature.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class StreamTerminatedReduce {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,3,4,5,6,7);
		Optional sum = list.parallelStream().reduce((a1,a2)->a1+a2);
		
		System.out.println("Default Way to print");
		
		System.out.println(sum);
		System.out.println("First Way to print");
		sum.ifPresent(System.out::println); 
		System.out.println("Second Way to print");
		if(sum.isPresent())
			System.out.println(sum.get());
		
		System.out.println("< =================   Another Example Initialize 10 ================== >");
Integer sum1 = list.stream().reduce(10,(a1,a2)->a1+a2); 
		
		
		System.out.println("First Way to print");
		System.out.println(sum1);
		
		System.out.println("< =================   Another Example ================== >");
		
		int product = IntStream.range(2, 8).reduce((num1, num2)-> num1*num2).orElse(-1);
		System.out.println(product);
		
	}
	
	
}
