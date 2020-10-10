package com.feature.StreamApi;

interface Demo{
	void say();
	default void call() {
		
	}
}

public class MethodReferenceDemoStatic {
	static int a=0,b=0;
	static void hello() {
		
		int sum = a*b;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		
		MethodReferenceDemoStatic.hello();
		
		
		  Demo d = () -> System.out.println("This is impl of Demo"); d.say();
		 
		Demo d1 = MethodReferenceDemoStatic::hello;
		MethodReferenceDemoStatic.a = 4;
		MethodReferenceDemoStatic.b = 9;
		
		
		d1.say();
		
	}
}
