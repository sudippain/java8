package com.feature.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

interface Parser{
	String parse(String str);
}

class StringParser{

	public static String convert(String s) {
		if(s.length()<=3)
			return s.toUpperCase();
		else
			return s.toLowerCase();
		
		
	}
}

class Myprinter{
	public void print(String name,Parser p) {
		name =  p.parse(name);
		System.out.println(name);
	}
}


public class MethodReference {
		public static void main(String[] args) {
			List <String> list = Arrays.asList("Sudip","Gokul","Bani","Soma");
			
			/*
			 * Consumer<String> o = new Consumer<String>() {
			 * 
			 * @Override public void accept(String arg0) { System.out.println(arg0);
			 * 
			 * }
			 * 
			 * };
			 */
			//Lamda Expression //
			/* list.forEach(s -> System.out.println(s)); */
			//Method Referance //
			/* list.forEach(System.out::println); */
		 String name = "Sud";
		 Myprinter mp = new Myprinter();
		 mp.print(name,StringParser::convert);
		}
}
