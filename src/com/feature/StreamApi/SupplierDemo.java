package com.feature.StreamApi;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {

	
	public static void main(String[] args) {
		Supplier<Integer> s = () -> (int)(Math.random()*10);
		
		System.out.println(s.get());
	}
}
