package com.feature.StreamApi;

interface I {

	default void show() {
		System.out.println("This is from interface I");
	}
}

interface J {

	default void show() {
		System.out.println("This is from interface J");
	}
}

class K {
	public void show() {
		System.out.println("This is from Class K");
	}
}

public class InterfaceClassPriority extends K implements I {

	public static void main(String[] args) {
		InterfaceClassPriority obj = new InterfaceClassPriority();
		obj.show(); // Return K class show method due to high priority of class over interface(Third
					// Priority)
	}

}
