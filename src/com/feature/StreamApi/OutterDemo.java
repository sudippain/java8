package com.feature.StreamApi;

public class OutterDemo {
 int outterVar = 4;
	public class InnerClassDemo2{
		int innerVar =5;
		void innerMethod() {
			System.out.println("This is from inner Mathod");
		}
	}
	
	public void outterMethod() {
		System.out.println("This is from outer method");
	}
	public static class mainClass{
	public static void main(String[] args) {
		OutterDemo o = new OutterDemo();
		System.out.println("<========= OutterDemo ===========>");
		System.out.println(o.outterVar);
		o.outterMethod();
		System.out.println("<========= OutterDemo ===========>");
		OutterDemo.InnerClassDemo2 i = ((Object) new OutterDemo()).InnerDemo2();
		
		
		
	}
	}
}
