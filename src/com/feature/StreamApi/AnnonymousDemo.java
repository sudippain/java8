package com.feature.StreamApi;

interface Anno{
	void method();
	default void don() {
		System.out.println("Here is default method wth don");
	}
}

public class AnnonymousDemo {

	
	public static void main(String[] args) {
		
	
		
		Anno o = new Anno() {
			
			@Override
			public void method() {
				System.out.println("Inner Class");
				
			}

			@Override
			public void don() {
				System.out.println("Don override in o");
				
			}
		};
		
		Anno ob =  new Anno() {

			@Override
			public void method() {
				System.out.println("Inner Class");
				
			}

			@Override
			public void don() {
				System.out.println("Don override in ob");
				
			}
		};
		
		Anno ob1 =  new Anno() {

			@Override
			public void method() {
				System.out.println("Inner Class");
				
			}

			@Override
			public void don() {
				System.out.println("Don override in ob1");
				
			}
		};
		o.method();
		ob.method();
		ob1.method();
		o.don();
		ob.don();
		ob1.don();
	}


	
}
