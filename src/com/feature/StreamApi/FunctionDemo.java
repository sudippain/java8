package com.feature.StreamApi;

import java.util.function.Function;

public class FunctionDemo {

	
	public static void main(String[] args) {
		Function<Integer,Integer> f = (a) -> a*2;
		
		Function<Integer,Integer> f1 = (a) -> a*2;
		f1 = f1.andThen(a -> a*a);
		System.out.println(f1.apply(4));
		
		
	}
}
