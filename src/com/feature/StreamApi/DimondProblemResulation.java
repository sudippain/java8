package com.feature.StreamApi;

interface DemoA{
	default void write() {
		System.out.println("This is from A interface write() method");
	}
}

interface DemoB{
	default void write() {
		System.out.println("This is from B interface write() method");
	}
}


public class DimondProblemResulation  implements DemoA,DemoB {

	
	
	public static void main(String[] args) {
		DimondProblemResulation d = new DimondProblemResulation();
		d.write();
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		DemoA.super.write();
		DemoB.super.write();
	}
}
