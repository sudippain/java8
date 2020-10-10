package com.feature.StreamApi;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

	public static void main(String[] args) {
		String a ="Sudip";
		String b ="Sudip";
		BiConsumer<String , String> s =
				(c,d) -> {
					if(c.equals(d))
						System.out.println("True"); 
					else
						System.out.println("False"); 
						
				
				};
				s.accept(a, b);
	}
}
