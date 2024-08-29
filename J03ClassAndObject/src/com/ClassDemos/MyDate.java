package com.ClassDemos;

public class MyDate {
	private int day;
	private String month;
	private int year;
	int no;

	public MyDate()			//Plain / Default / No Parameter Constructor
	{
		day = 1;
		month = "January";
		year = 2024;
		System.out.println("Plain / Default / No Parameter Constructor Called");
	}
	public MyDate(int d, String m, int y) //Parameterized constructor
	{
		day = d;
		month = m;
		year = y;
		System.out.println("Parameterized constructor called");
	}

	public MyDate(int d, String m) {
		day = d;
		month = m;
		year = 2000;
		System.out.println("Second Parameterized constructor Called");
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setDay(int day)		//Mutator Method
	{
		this.day = day;
		//class.day = paramater day;
	}
	public int getDay()				//Accessor Method
	{
		return day;
	}
	public void displayDate()		//Facilitator Method
	{
		System.out.println("Date: " + this.day + "-" + this.month + "-" + this.year);
	}
}
