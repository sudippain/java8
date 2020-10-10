package com.feature.StreamApi;

interface DemoA1{
	default void write() {
		System.out.println("This is from A interface write() method");
	}
}

interface DemoB1{
	default void write() {
		System.out.println("This is from B interface write() method");
	}
}
class dimond{
	void write() {
		System.out.println("This is from dimond class write() method");
	}
}

public class classPriorityOverInterface extends dimond implements DemoA1,DemoB1 {

	
	public  void write() {
		System.out.println("This is from DimondProblemResulation class write() method override");
	}
	public static void main(String[] args) {
		classPriorityOverInterface d = new classPriorityOverInterface();
		d.write();
	}
}
