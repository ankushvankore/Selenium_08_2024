package com.InheritanceDemos;

public final class Manager extends Employee
{
	private int hours;
	private double rate;
	
	public Manager()
	{
		super();		//Call plain constructor of Employee class
		hours = 0;
		rate = 0;
		System.out.println("Manager->Plain");
	}
	public Manager(int id, String nm, int age, double bs, int h, double r)
	{
		super(id, nm, age, bs);	//Call parameterized constructor of Employee class
		hours = h;
		rate = r;
		System.out.println("Manager->Parameterized");
	}
	public void displayData()
	{
		super.displayData();
		//basicSalary = 9;
		System.out.println("Total Hours  : " + hours);
		System.out.println("Rate per Hour: " + rate);
	}
	public double calculateSalary()
	{
		double insentive = hours * rate;
		return(super.calculateSalary() + insentive);
	}
	
	//void calAvgMarks()
	//void calAvgMarks(int m1, int m2, int m3, int m4, int m5);
	//double calAvgMarks(int m1, int m2, int m3, int m4, int m5);
	//double calAvgMarks()
}


