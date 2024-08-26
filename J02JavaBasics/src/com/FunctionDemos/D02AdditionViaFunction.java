package com.FunctionDemos;

import java.util.Scanner;

public class D02AdditionViaFunction {

	public static void main(String[] args) {
		calculateAddition();
		System.out.println("Performing some another operation");
		calculateAddition();
	}
	public static void calculateAddition()
	{
		int no1, no2, sum;
		Scanner scn = new Scanner(System.in);
				
		System.out.print("Enter No1: ");
		no1 = scn.nextInt();
		System.out.print("Enter No2: ");
		no2 = scn.nextInt();
				
		sum = no1 + no2;
				
		System.out.println("Addition: " + sum);
	}

}
