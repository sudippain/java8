package com.feature.StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class filterMapCountSortedDistinctMaxMin {

	public static void main(String[] args) {
		List<Integer> listNum = Arrays.asList(3,2,1,4,5);
		Predicate<Integer> p = a -> a>3;
		Consumer<Integer> c = b -> System.out.println(b);
		System.out.println("<============== Filter =============>");
		System.out.println("Using Predicate and Consumer");
		listNum.stream().filter(p).forEach(c);
		System.out.println("Using Normal Process");
		listNum.stream().filter(a ->a>3).forEach(System.out::println);
		
		System.out.println("<============== Map =============>");
		Function<Integer, Integer> f = a -> a*2;
		System.out.println("Using Function");
		listNum.stream().map(f).forEach(System.out::println);
		System.out.println("Using Normal Process");
		listNum.stream().map(a -> a*2).forEach(System.out::println);
		
		System.out.println("<============== Count =============>");
		System.out.println(listNum.stream().count());
		
		System.out.println("<============== Sorted =============>");
		listNum.stream().sorted().forEach(System.out::println);
		
		System.out.println("<============== Distinct =============>");
		List<String> name = Arrays.asList("Sudip","Payel","Puja","Gokul","Sudip");
		name.stream().distinct().forEach(System.out::println);
		
		System.out.println("<============== Max =============>");

		Comparator<Integer> cmmax = (a,b)->Integer.compare(a, b);
		System.out.println(listNum.stream().max(cmmax).get());
		listNum.stream().max(Integer::compare).get();
		
		System.out.println("<============== Min =============>");

		Comparator<Integer> cmmin = (a,b)->Integer.compare(a, b);
		System.out.println(listNum.stream().min(cmmin).get());
		
		
		
		
	}
}
