package com.feature.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class StreamTerminateCollector {

	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,3,4,5,6,7);
		list = list.stream().map(x -> x*x).collect(Collectors.toList());
		System.out.println(list);
		
	}
}
