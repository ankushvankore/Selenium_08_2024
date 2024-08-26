package com.FunctionDemos;

import java.util.Scanner;

public class D03PassingParameters {

	public static void main(String[] args) {
		calculateSqure(5);
		
		int no1;
		Scanner scn = new Scanner(System.in);
				
		System.out.print("Enter No1: ");
		no1 = scn.nextInt();
		
		calculateSqure(no1);

	}
	public static void calculateSqure(int no)
	{
		int ans = no * no;
		System.out.println("Squre of " + no + ": " + ans);
	}
}
