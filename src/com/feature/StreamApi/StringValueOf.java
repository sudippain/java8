package com.feature.StreamApi;

import java.util.function.Function;

public class StringValueOf {
	
	static String change(int num) {
		String a = Integer.toString(num);
		return a;
	}

	public static void main(String[] args) {
		int n = 3;
		String val = String.valueOf(3) ;
		System.out.println(val);
		
		Function<Integer, String> f = StringValueOf::change;
		System.out.println(f.apply(3));
		
	}
}
