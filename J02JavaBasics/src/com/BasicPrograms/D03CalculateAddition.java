package com.BasicPrograms;

import java.util.Scanner;

public class D03CalculateAddition {
	public static void main(String[] args) {
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
