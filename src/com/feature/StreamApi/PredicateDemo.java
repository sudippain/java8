package com.feature.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {

	
	public static void main(String[] args) {

        Predicate<Integer> noGreaterThan5 =  x -> x > 5;

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> collect = list.stream()
                .filter(noGreaterThan5)
                .collect(Collectors.toList());
        System.out.println("<================ Predicate in filter() ===========>");
        System.out.println(collect);
        
        System.out.println("<================ Predicate in filter() ===========>");
        
        Predicate<String> lengthIs3 = x -> x.length() == 3;
        Predicate<String> startWithA = x -> x.startsWith("A");

        List<String> list1 = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");

        List<String> collect1 = list1.stream()
                .filter(lengthIs3.or(startWithA))
                .collect(Collectors.toList());

        System.out.println(collect1);
        
        System.out.println("<================ Predicate in filter() with negate ===========>");

        List<String> collect2 = list1.stream()
                .filter(startWithA.negate())
                .collect(Collectors.toList());

        System.out.println(collect2);
        
        
        System.out.println("<================ Predicate in chain ===========>");
        
        Predicate<String> startWithA1 = x -> x.startsWith("a");

        // start with "a" or "m"
        boolean result = startWithA1.or(x -> x.startsWith("m")).test("mkyong");
        System.out.println(result);     // true

        // !(start with "a" and length is 3)
        boolean result2 = startWithA1.and(x -> x.length() == 3).negate().test("abc");
        System.out.println(result2);    // false
	}
}
