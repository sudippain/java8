package com.feature.StreamApi;



import java.util.Arrays;
import java.util.List;

public class findfirstAndfindAny {
	
	public static void main(String[] args) {
		System.out.println("<========== findFirst Using parallel stream() ===========>");
		List<Integer> l = Arrays.asList(1,2,3,4);
		l.stream().parallel().findFirst().ifPresent(System.out::println);
		
		System.out.println("<========== findFirst Using parallel stream() ===========>");
		
		l.stream().parallel().findFirst().ifPresent(System.out::println);
		
		System.out.println("<========== findAny Using parallel stream() ===========>");
		
		l.stream().findAny().ifPresent(System.out::println);
		
		System.out.println("<========== findAny Using parallel stream() ===========>");
	
		l.stream().parallel().findAny().ifPresent(System.out::println);
	}
	
	

}
