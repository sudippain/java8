package com.feature.StreamApi;

import java.util.Stack;

public class StackString {

	public static void main(String[] args) {
		String name = "Madam1";
		String revname ="";
		
		
		/*
		 * for(int i=name.length()-1;i>=0;i--) { revname = revname + name.charAt(i); }
		 * System.out.println(revname); if(name.equalsIgnoreCase(revname))
		 * System.out.println("Palindrom"); else System.out.println("Not Palindrom");
		 */
			
			
			char arr[] = name.toCharArray();
            char revarr[] = new char[arr.length];
			for(int i = 0;i<arr.length;i++) {
				revarr[i] = arr[arr.length-1-i];
			}
		if(name.equalsIgnoreCase(String.valueOf(revarr)))
				System.out.println("Palindrome");
		else
			System.out.println("Not Palidrome");
	}
	
	
}
