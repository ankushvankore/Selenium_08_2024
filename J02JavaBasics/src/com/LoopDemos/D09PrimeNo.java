package com.LoopDemos;

import java.util.Scanner;

public class D09PrimeNo {

	public static void main(String[] args) {
		int no, i;
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter No1: ");
		no = scn.nextInt();
		
		for(i = 2; i <= no; i++)
		{
			if(no % i == 0)
				break;
		}
		if(no == i)
			System.out.println("This is prime no");
		else
			System.out.println("This is not prime no");
	}

}
