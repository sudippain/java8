package com.feature.StreamApi;

interface M{
	static void run() {
		System.out.println("This is a static run() method from interface M");
	}
}

public class staticMethods implements M{
	
	public static void main(String[] args) {
		
		M.run();
	}

}
