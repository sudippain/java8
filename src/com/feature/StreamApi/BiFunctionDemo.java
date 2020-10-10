package com.feature.StreamApi;

import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {
		// BiFunction to add 2 numbers
		BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

		// Implement add using apply()
		System.out.println("Sum = " + add.apply(2, 3));

		// BiFunction to multiply 2 numbers
		BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;

		// Implement add using apply()
		System.out.println("Product = " + multiply.apply(2, 3));
		
		
		  BiFunction<Integer, Integer, Integer> composite1 = (a, b) -> a + b; 
		  
	        // Using addThen() method 
	        composite1 = composite1.andThen(a -> 2 * a); 
	        
	        System.out.println(composite1.apply(2, 3));
	        
	        BiFunction<Integer, Integer, Integer> composite = (a, b) -> a + b; 
	        
	        try { 
	            // Using addThen() method 
	            composite = composite.andThen(null); 
	  
	            // Printing the result 
	            System.out.println("Composite = " + composite.apply(2, 3)); 
	        } 
	        catch (Exception e) { 
	            System.out.println("Exception: " + e); 
	        } 
	        
	        
	        BiFunction<Integer, Integer, Integer> composite3 = (a, b) -> a + b; 
	        
	        // Using addThen() method 
	        composite3 = composite3.andThen(a -> a / (a - 5)); 
	  
	        try { 
	            // Printing the result using apply() 
	            System.out.println("Composite = " + composite3.apply(2, 3)); 
	        } 
	        catch (Exception e) { 
	            System.out.println("Exception: " + e); 
	        } 
	}
}
