package com.BasicPrograms;

import java.util.Scanner;

public class D04CalculateArea {

	public static void main(String[] args) {
		int rd;
		double area;
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter Radius: ");
		rd = scn.nextInt();
		
		//area = (double)22/7 * rd * rd;
		//area = 22/7.0 * rd * rd;
		area = 3.142 * rd * rd;
		
		System.out.println("Area of Circle: " + area);
	}

}