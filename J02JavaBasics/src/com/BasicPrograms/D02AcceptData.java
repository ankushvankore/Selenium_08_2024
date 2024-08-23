package com.BasicPrograms;

import java.util.Scanner;

public class D02AcceptData {
	public static void main(String args[])
	{
		int no1;
		double avg;
		String name;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		no1 = scn.nextInt();
		
		System.out.print("Enter Average: ");
		avg = scn.nextDouble();
		
		System.out.print("Enter Name: ");
		name = scn.next();
		
		System.out.println("Number: " + no1);
		System.out.println("Average: " + avg);
		System.out.println("Name: " + name);
	}

}
