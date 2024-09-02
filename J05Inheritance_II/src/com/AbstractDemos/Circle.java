package com.AbstractDemos;

public class Circle extends Shape implements Printable
{
	int rd;

	public Circle(int rd) {
		this.rd = rd;
	}
	
	
	public void calculateArea()
	{
		double area = 3.142 * rd * rd;
		System.out.println("Area of Circle: " + area);
	}
	
	public void print()
	{
		System.out.println("This is Circle class");
	}
}
