package com.ArrayAssignments;

import java.util.Scanner;

public class D01OddEvenCount {

	public static void main(String[] args) {
		//int[] arr = {12, 74, 85, 98, 75, 69, 25, 65, 42, 38};
		int[] arr = new int[10];
		int oddCount = 0, evenCount = 0;
		Scanner scn = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print("Enter Element no" + (i+1) + ": ");
			arr[i] = scn.nextInt();
		}
		
		/*for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] % 2 == 0)
				evenCount++;
			else
				oddCount++;
		}*/
		
		for(int no : arr)
		{
			if(no % 2 == 0)
				evenCount++;
			else
				oddCount++;
		}
		
		System.out.println("Odd Numbers: " + oddCount);
		System.out.println("Even Numbers: " + evenCount);
		
	}

}
