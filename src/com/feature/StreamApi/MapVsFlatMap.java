package com.feature.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapVsFlatMap {

	public static void main(String[] args) {
		
		System.out.println("<============= Map =============>");
		
		List<String> l = Arrays.asList("1","2","3","4","5");
		List<Integer> listOfIntegers =l.stream().map(Integer::valueOf).collect(Collectors.toList());
		System.out.println(listOfIntegers);
		
		
		System.out.println("<============= Flat Map =============>");
		
		List <Integer> l1 = Arrays.asList(2,3);
		List <Integer> l2 = Arrays.asList(4,5);
		List <Integer> l3 = Arrays.asList(6,7);
		
		List<List<Integer>> sumList = Arrays.asList(l1,l2,l3);
		List<Integer> margeList = sumList.stream().flatMap(a -> a.stream()).collect(Collectors.toList());
		System.out.println(margeList);
	}
}
