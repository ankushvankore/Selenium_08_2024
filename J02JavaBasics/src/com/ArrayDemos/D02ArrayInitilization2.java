package com.ArrayDemos;

import java.util.Arrays;

public class D02ArrayInitilization2 {

	public static void main(String[] args) {
		//int[] marks = new int[] {65, 75, 35, 45, 12, 85, 55, 41, 33, 75, 87};
		int[] marks =  {65, 73, 35, 45, 12, 85, 55, 41, 33, 75, 87};
		
		for(int i = 0; i < marks.length; i++)
			System.out.println(marks[i]);
		
		Arrays.sort(marks);
		
		System.out.println("Array After Sorting\n");
		
		//for(int i = 0; i < marks.length; i++)
			//System.out.println(marks[i]);
		
		for(int m : marks)
		{
			System.out.println(m);
		}
	}

}
