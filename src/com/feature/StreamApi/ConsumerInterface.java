package com.feature.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
class ConsImpl implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
	  System.out.println(t);
		
	}
	
}
*/
public class ConsumerInterface {

	
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(34, 56, 67, 89, 90);
		/* Consumer<Integer> c = new ConsImpl(); */
		
		Consumer<Integer> c = (t) ->{
				  System.out.println(t);
					
				
		};
		values.forEach(c);
	}
}
