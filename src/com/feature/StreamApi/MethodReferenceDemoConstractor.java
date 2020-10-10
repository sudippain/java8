package com.feature.StreamApi;

import java.util.function.Supplier;
interface DemoCons{
	void news();
}
interface DemoCons2{
	void news(String name);
}
public class MethodReferenceDemoConstractor {

	MethodReferenceDemoConstractor(){
		
		System.out.println("This is from MethodReferenceDemoConstractor default Constractor");
	}
	
	MethodReferenceDemoConstractor(String name){	
		System.out.println("Constractorwith a single parameter -->"+name);
	}
	public static void main(String[] args) {
		Supplier<MethodReferenceDemoConstractor> s = MethodReferenceDemoConstractor::new;
		System.out.println(s.get());
		
		DemoCons dc = MethodReferenceDemoConstractor::new;
		dc.news();
		DemoCons2 dc2 = MethodReferenceDemoConstractor::new;
		dc2.news("Sudip");
	}
}
