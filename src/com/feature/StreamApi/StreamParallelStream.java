package com.feature.StreamApi;

import java.util.Arrays;
import java.util.List;

public class StreamParallelStream {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(90,23,13,67,37,88);
		System.out.println("Using Normal Stream");
		l.stream().sorted().forEach(System.out::println);
		System.out.println("Using Parallel Stream");
		l.parallelStream().sorted().forEach(System.out::println);
		System.out.println("Using Parallel Stream With Different Syntax");
		l.stream().parallel().sorted().forEach(System.out::println);
	}
}
