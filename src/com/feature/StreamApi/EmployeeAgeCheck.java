package com.feature.StreamApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeAgeCheck {

	public static void main(String[] args) {
		
		List<Employee> empList = Arrays.asList(new Employee("Sudip",25,300000),new Employee("Somasree", 26,500000),new Employee("Gokul", 56,400000),new Employee("Bani", 40,200000));
		
		
		System.out.println("<============ Find the list of Employee who's age is more than 25 ==================>");
		empList.stream().filter(e ->e.getAge()>25).forEach(System.out::println);
		
		
		
		System.out.println("<============ Find the name of Employee who's age is more than 25 ===================>");
		empList.stream().filter(e ->e.getAge()>25).map(e ->e.getEmpName()).forEach(System.out::println);
		
		
		
		System.out.println("<============ Find the name of Employee who's name is sudip ===========>");
		empList.stream().filter(e->e.getEmpName().equalsIgnoreCase("sudip")).forEach(System.out::println);
		
		
		System.out.println("<============ Find the list of Employee with the descending age ===========>");
		empList.sort((Employee s1, Employee s2) ->s1.getAge()-s2.getAge());
		Collections.reverse(empList);
		System.out.println(empList);
		
		System.out.println("<============ Find the list of Employee with the ascending salary ===========>");
		Comparator<Employee> c = (Employee s1, Employee s2) -> s1.getSalary() - s2.getSalary();
		empList.sort(c);
		Collections.reverse(empList);
		System.out.println(empList);
	}
}
