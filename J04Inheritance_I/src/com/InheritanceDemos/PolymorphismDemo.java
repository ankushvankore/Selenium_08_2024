package com.InheritanceDemos;

public class PolymorphismDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee(123, "Chaitrali", 24, 55000);
		Manager m1 = new Manager(456, "Priyanka", 24, 50000, 50, 500.00);
		
		Employee emp;			//Reference of Employee class
								//Generic Reference
		emp = e1;
		emp.displayData();
		System.out.println("Net Salary   : " + emp.calculateSalary());
		
		System.out.println("-----------------------------------");
		
		emp = m1;
		emp.displayData();
		System.out.println("Net Salary   : " + emp.calculateSalary());
		
		final double pi = 3.142;
		//pi = 88.2;
	}

}
