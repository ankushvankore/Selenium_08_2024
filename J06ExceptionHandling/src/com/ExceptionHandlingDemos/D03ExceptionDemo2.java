package com.ExceptionHandlingDemos;

public class D03ExceptionDemo2 {

	public static void main(String[] args) throws InterruptedException {
		sayHello();
		System.out.println("Hi from main()");
	}
	
	public static void sayHello() throws InterruptedException
	{
		System.out.println("Welcome from Function");
		Thread.sleep(5000);
	}

}
