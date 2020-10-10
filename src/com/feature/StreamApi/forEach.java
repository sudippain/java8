package com.feature.StreamApi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class forEach {
public static void main(String[] args) {

	List<Integer> al = Arrays.asList(2,9,8,4,7);
	 System.out.println("Using for loop");
	for(int k=0;k<al.size();k++)
		System.out.print(al.get(k)+"\t");
   System.out.println("\nUsing for loop2");	
	for(int i : al)
		System.out.print(i+"\t");
	
	System.out.println("\nUsing forEach Loop");
	al.forEach(i -> System.out.print(i+"\t"));
	
}
}
