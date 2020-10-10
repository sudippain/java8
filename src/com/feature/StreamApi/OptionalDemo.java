package com.feature.StreamApi;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		
		 String[] words = new String[10]; 
		 words[1] = "Sudip";
		Optional<String> name = Optional.ofNullable(words[1]);
		Optional<String> name1 = Optional.ofNullable(words[0]);
		Optional<String> name2 = Optional.of(words[1]);
		System.out.println(name.get());
		
		name.ifPresent((g)-> System.out.println("The value is present"));
		//No Output
		name1.ifPresent( (g)-> System.out.println("The value is not present"));
		
		System.out.println(name.orElse(iAmStillExecuted()));
		
		System.out.println(name.orElseGet(() -> iAmStillExecuted()));
		
		System.out.println(name1.orElseThrow(NumberFormatException::new));
		
		
	}
	
	public static String iAmStillExecuted(){
	    System.out.println("nonEmptyOptional is not NULL,still I am being executed");
	    return "I got executed";
	    }
}
