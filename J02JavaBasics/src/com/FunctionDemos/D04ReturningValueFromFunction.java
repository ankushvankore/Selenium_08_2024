package com.FunctionDemos;

import java.util.Scanner;

public class D04ReturningValueFromFunction {

	public static void main(String[] args) {
		double area = calculateAreaOfCircle(5);
		System.out.println("Area of Circle: " + area);
		
		int rd;
		Scanner scn = new Scanner(System.in);
				
		System.out.print("Enter Radius: ");
		rd = scn.nextInt();
		
		area = calculateAreaOfCircle(rd);
		System.out.println("Area of Circle: " + area);
	}
	public static double calculateAreaOfCircle(int rd)
	{
		double area = 3.142 * rd * rd;
		return area;
		//System.out.println("sss");
	}
	
	/*
	 * Points to be noted about return
	 * 1. return statement returns a value to the calling function
	 * 2. return statement terminates the function
	 * 3. You can not write any code after return
	 * 4. return statement can return single value at a time
	 * 5. But you may have multiple return statements
	 * 
	 */
}
