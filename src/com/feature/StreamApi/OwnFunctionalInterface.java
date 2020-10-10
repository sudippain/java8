package com.feature.StreamApi;

@FunctionalInterface //This annotation is not mandatory but used for best practise.
interface ownFuncInterface{
	void functionalInterfacenmethod();
	
}
public class OwnFunctionalInterface {

	public static void main(String[] args) {
		
		ownFuncInterface o = () -> System.out.println("This is from functiona interface method");
	
		
		
		o.functionalInterfacenmethod();
	}
}
