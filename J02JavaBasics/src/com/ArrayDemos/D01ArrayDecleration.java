package com.ArrayDemos;

public class D01ArrayDecleration {

	public static void main(String[] args) {
		int[] marks = new int[5];

		marks[0] = 85;
		marks[1] = 95;
		marks[2] = 74;
		marks[3] = 68;
		marks[4] = 76;
		
		/*
		 
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		*/
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println(marks[i]);
		}
	}

}
