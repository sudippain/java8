package com.feature.StreamApi;

interface defaultMethod{
	default void name() {
		System.out.println("Sudip");
	}
}

/* over ride default method */
public class defaultMethoDemo implements defaultMethod{

	@Override
	public void name() {
		System.out.println("This is override");
	}
	public static void main(String[] args) {
	
		new defaultMethoDemo().name();
	}

}
