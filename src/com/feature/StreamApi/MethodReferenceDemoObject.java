package com.feature.StreamApi;

import java.util.function.BiFunction;

public class MethodReferenceDemoObject {

	int add(int a,int b) {
		return a*b;
	}
	public static void main(String[] args) {
		MethodReferenceDemoObject obj = new MethodReferenceDemoObject();
		BiFunction<Integer, Integer, Integer> bf = new MethodReferenceDemoObject()::add;
		System.out.println(bf.apply(10, 20));
	}
}
