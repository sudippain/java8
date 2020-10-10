package com.feature.StreamApi;

import java.util.Arrays;
import java.util.List;

public class StreamTerminateForEach {

	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,3,4,5,6,7);
		list.stream().map(x-> x+x ).filter(x ->x>6).sorted().forEach(x ->System.out.println(x));
	}
}
