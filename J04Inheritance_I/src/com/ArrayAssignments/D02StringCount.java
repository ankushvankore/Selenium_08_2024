package com.ArrayAssignments;

public class D02StringCount {

	public static void main(String[] args) {
		String str = "Hello Friends, Welcome to AViIT Batch 08!!!";
		int small = 0, capital = 0, digit = 0, special = 0, spaces = 0;
		
		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch))
				capital++;
			else if(Character.isLowerCase(ch))
				small++;
			else if(Character.isDigit(ch))
				digit++;
			else if(Character.isSpaceChar(ch))
				spaces++;
			else 
				special++;
		}
		System.out.println("Total Uppercase Characters: " + capital);
		System.out.println("Total Lowercase Characters: " + small);
		System.out.println("Total Special Characters: " + special);
		System.out.println("Total Speces: " + special);
		System.out.println("Total Digits: " + digit);
		
		
	}

}
