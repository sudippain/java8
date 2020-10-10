package com.feature.StreamApi;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) {
		BiPredicate<String, Integer> s1 = (name,length) ->{
			
			return name.length() == length;
		};
		BiPredicate<String, Integer> s2 = (name,length) ->{
			
			return name.length() == length;
		};
		System.out.println(s1.or(s2));
		System.out.println(s1.and(s2));
		System.out.println(s1.test("Sudip", 5));
		System.out.println(s2.test("Somasree", 6));
	}
}
