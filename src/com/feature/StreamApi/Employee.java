package com.feature.StreamApi;

public class Employee {

	private String empName;
	private int age;
	private int salary;
	
	public Employee() {
		super();
	}

	public Employee(String empName, int age,int salary) {
		super();
		this.empName = empName;
		this.age = age;
		this.salary = salary;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", age=" + age + ", salary=" + salary + "]";
	}
	
}
