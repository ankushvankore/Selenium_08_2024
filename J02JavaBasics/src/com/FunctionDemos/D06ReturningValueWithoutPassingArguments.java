package com.FunctionDemos;

public class D06ReturningValueWithoutPassingArguments {

	public static void main(String[] args) {
		int s = calSumOf1to10();
		System.out.println("Sum of 1st 10 natural nos: " + s);
	}
	
	public static int calSumOf1to10()
	{
		int i, sum = 0;
		
		for(i = 1; i <= 10; i++)
		{
			sum = sum + i;
		}
		
		return sum;
	}
}
