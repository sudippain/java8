package com.feature.StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamApiDemoMap {

	public static void main(String[] args) {
		
		int mul =0;
	    
	    List<Integer> list2 = Arrays.asList(2,3,4,5,6);
	    List<Integer> list3 = new ArrayList<>();
	    for(int j : list2) {
	    	
	      mul = j * 2;
	      list3.add(mul);
	      
	    }
	    
	   
	    list3.clear();
	    double time1 = System.currentTimeMillis();
	     list2.stream().map(x -> x*x).forEach(x ->System.out.println(x));
	    double time2 = System.currentTimeMillis();
	    System.out.println(time2-time1);
		/*
		 * for(int j : list3) System.out.println(j);
		 */
	    double time3 = System.currentTimeMillis();
	  list2.parallelStream().map(x -> x*x).forEach(x -> System.out.println(x));
	    double time4 = System.currentTimeMillis();
	    System.out.println(time4-time3);
		
	    
	    
		
			 
	}
	
	

}
