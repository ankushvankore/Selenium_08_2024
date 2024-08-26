package com.FunctionDemos;

import java.util.Scanner;

public class D05MultipleReturn {

	public static void main(String[] args) {
		int no1, no2, max;
		Scanner scn = new Scanner(System.in);
				
		System.out.print("Enter No1: ");
		no1 = scn.nextInt();
		System.out.print("Enter No2: ");
		no2 = scn.nextInt();
		
		max = findMax(no1, no2);
		System.out.println("Maximum No: " + max);
	}
	
	public static int findMax(int n1, int n2)
	{
		if(n1 > n2)
			return n1;
		else
			return n2;
	}

}
