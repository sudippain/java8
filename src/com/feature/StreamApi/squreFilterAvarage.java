package com.feature.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;

public class squreFilterAvarage {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,4,2,6,3,9);
		
		OptionalDouble o =list.stream().mapToInt(a->a).map(a -> a*a).filter(a ->a>10).average();
		System.out.println(o.getAsDouble());
	}
}
