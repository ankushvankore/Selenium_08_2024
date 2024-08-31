package com.InheritanceDemos;

public class Client {

	public static void main(String[] args) {
		Manager m1 = new Manager();
		m1.displayData();
		System.out.println("Net Salary   : " + m1.calculateSalary());
		
		System.out.println("---------------------------------");
		
		Manager m2 = new Manager(111, "Chaitrali", 25, 50000, 50, 500);
		m2.displayData();
		System.out.println("Net Salary   : " + m1.calculateSalary());
	}

}
