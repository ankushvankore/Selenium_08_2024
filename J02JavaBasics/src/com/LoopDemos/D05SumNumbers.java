package com.LoopDemos;

import java.util.Scanner;

public class D05SumNumbers {

	public static void main(String[] args) {
		int no1, no2, sum;
		String ch;
		Scanner scn = new Scanner(System.in);

		do {
			System.out.print("Enter No1: ");
			no1 = scn.nextInt();
			System.out.print("Enter No2: ");
			no2 = scn.nextInt();

			sum = no1 + no2;

			System.out.println("Addition: " + sum);
			System.out.print("Do you want to continue? (Y/N): ");
			ch = scn.next();
		} while (ch.equals("Y") || ch.equals("y"));

	}

}