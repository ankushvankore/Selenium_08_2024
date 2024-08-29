package com.ClassDemos;

public class ClientEmployee {

	public static void main(String[] args) {
		Employee.setCompany("Persistance");
		Employee e1 = new Employee();
		
		e1.displayData();
		double sal = e1.calculateSalary();
		System.out.println("Net Salary   : " + sal);
		
		Employee e2 = new Employee(123, "Chaitrali", 24, 55000);
		e2.displayData();
		//sal = e2.calculateSalary();
		//System.out.println("Net Salary   : " + sal);
		System.out.println("Net Salary   : " + e2.calculateSalary());
		
				
		Employee e3 = new Employee(111, "Nandkumar", 24, 55000);
		//e3.setCompany("Persistance Pvt. Ltd.");
		e3.displayData();
		System.out.println("Net Salary   : " + e3.calculateSalary());
		
	}

}
