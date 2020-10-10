package com.feature.StreamApi;

import java.util.Random;

public class RandomForEach {

	public static void main(String[] args) {
	
	
		Random r = new Random();
		System.out.println("<========  Generate Randam number for Integer =========>");
		r.ints(10).map(a->Math.abs(a)).forEach(System.out::println);
		System.out.println("<========  Generate Randam number for Doubles =========>");
		r.doubles(10).forEach(System.out::println);
	
	}
}
