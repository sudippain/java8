package com.feature.StreamApi;

interface N{
	void call();
	default void message() {
		System.out.println("This is from interface N message() method");
	}
}

class B implements N{

	@Override
	public void call() {
	System.out.println("This is from class B implementing method of N");
		
	}
	
	public void sudip() {
		System.out.println("Hello Sudip");
	}
	
}

public class defaultCallingInterfaceRef {
	
	public static void main(String[] args) {
		N obj = new B();
		obj.call();
		obj.message();
		
	}

}
