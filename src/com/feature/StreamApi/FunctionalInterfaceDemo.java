package com.feature.StreamApi;

@FunctionalInterface
interface functionalIface{
	 void show();
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		functionalIface obj = () -> System.out.println("Sudip Is here");
		 obj.show();
		
	}

	

	
	
}
