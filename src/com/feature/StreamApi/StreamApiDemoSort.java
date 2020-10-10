package com.feature.StreamApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemoSort {

	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(34,89,12,56,78,99,11);
	    Collections.sort(list);
	    System.out.println("Sorting using normal Process");
	    for(int i : list)
	    	System.out.println(i);
	    
	    System.out.println("Sorting using StreampApi Process with collect Method");
	    list = list.stream().sorted().collect(Collectors.toList());
	    
		/* System.out.println(list); */
	    for(int i : list)
	    	System.out.println(i);
	    
	    
	    System.out.println("Sorting using StreampApi Process with forEach");
	    	list.stream().sorted().forEach(s -> System.out.println(s));
			
	}
	 
}
