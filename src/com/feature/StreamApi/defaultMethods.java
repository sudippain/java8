package com.feature.StreamApi;

interface L{
	default void run() {
		System.out.println("This is from run method inside I intrface");
	}
}

public class defaultMethods implements L {
	
	public static void main(String[] args) {
		defaultMethods obj = new defaultMethods();
		obj.run();
	}

}
