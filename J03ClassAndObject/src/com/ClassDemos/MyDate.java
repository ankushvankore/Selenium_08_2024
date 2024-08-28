package com.ClassDemos;

public class MyDate {
	private int day;
	private String month;
	private int year;
	
	public MyDate()
	{
		day = 1;
		month = "Jan";
		year = 2024;
		System.out.println("Constructor Called");
	}
	
	public void setDay(int d)		//Mutator Method
	{
		day = d;
	}
	public int getDay()				//Accessor Method
	{
		return day;
	}
	public void displayDate()		//Facilitator Method
	{
		System.out.println("Date: " + day + "-" + month + "-" + year);
	}
}
