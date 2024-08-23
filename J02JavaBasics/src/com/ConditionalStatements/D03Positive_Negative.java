package com.ConditionalStatements;

import java.util.Scanner;

public class D03Positive_Negative {

	public static void main(String[] args) {
		int no;
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		no = scn.nextInt();
		
		if(no > 0)
		{
			System.out.println("Number is +ve");
		}
		else
		{
			System.out.println("Number is -ve");
		}

	}

}
