package com.FunctionDemos;

public class D07MethodOverloading {

	public static void main(String[] args) {
		calculateAddition(5.5, 6.6);
		calculateAddition(10, 20, 30);

	}

	public static void calculateAddition(int n1, int n2)
	{
		int ans = n1 + n2;
		System.out.println("Addition: " + ans);
	}
	public static void calculateAddition(int n1, int n2, int n3)
	{
		int ans = n1 + n2 + n3;
		System.out.println("Addition: " + ans);
	}
	public static void calculateAddition(double n1, double n2)
	{
		double ans = n1 + n2;
		System.out.println("Addition: " + ans);
	}
	public static void calculateAddition(int n1, double n2)
	{
		double ans = n1 + n2;
		System.out.println("Addition: " + ans);
	}
	public static void calculateAddition(double n1, int n2)
	{
		double ans = n1 + n2;
		System.out.println("Addition: " + ans);
	}
}
