package com.ClassDemos;

public class Employee {
	//Instance Member
	private int empId;
	private String empName;
	private int age;
	private double basicSalary;
	private static String company;
	
	public static void setCompany(String c)
	{
		company = c;
	}
	
	public Employee()
	{
		empId = 101;
		empName = "Priyanka";
		age = 23;
		basicSalary = 50000;
	}

	public Employee(int empId, String empName, int age, double basicSalary) {
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.basicSalary = basicSalary;
	}
	
	public double calculateSalary()
	{
		double da, hra, pf, net;
		
		da = basicSalary * 0.50;
		hra = basicSalary * 0.20;
		pf = basicSalary * 0.05;
		net = basicSalary + da + hra - pf;
		
		return net;
	}
	
	public void displayData()
	{
		System.out.println("Employee ID  : " + empId);
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Age : " + age);
		System.out.println("Basic Salary : " + basicSalary);
		System.out.println("Company Name : " + company);
	}
	
}
