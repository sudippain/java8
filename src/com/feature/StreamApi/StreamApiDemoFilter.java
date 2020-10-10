package com.feature.StreamApi;

import java.util.ArrayList;
import java.util.List;

public class StreamApiDemoFilter {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<=1000000;i++) {
			int randnum = (int)(Math.random() * 100);
		
			list.add(randnum);
		}
		long starttime = System.currentTimeMillis();
		usingExternalIterator(list);
		long endtime = System.currentTimeMillis();
		System.out.println(endtime-starttime);
		lamdaStreamApi(list);
		long endtime1 = System.currentTimeMillis();
		System.out.println(endtime1-endtime);
	}

	
	private static void usingExternalIterator(List<Integer> list) {
		int sum = 0;
		for(Integer i : list)
		{
			if(i.intValue()>10) {
				sum = sum + i.intValue();
			}
		}
		System.out.println("Sum of number greater than 10 using Normal iterator---> "+sum);
	}
	
	private static void lamdaStreamApi(List<Integer> list) {
		int sum = list.stream().filter(i -> i>10).mapToInt(j -> j).sum();
		System.out.println("Using Lamda and StreamApi sum of number greater than 10 ---> "+sum);
		
	}

}
