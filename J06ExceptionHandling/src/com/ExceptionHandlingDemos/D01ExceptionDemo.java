package com.ExceptionHandlingDemos;

import java.util.Scanner;
import java.util.zip.DataFormatException;

public class D01ExceptionDemo {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		int i;
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter Index: ");
		i = scn.nextInt();
		
		try
		{
			System.out.println(arr[i]);
		}
		catch(NullPointerException ex)
		{
			System.out.println(ex);
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex);
		}
		catch(ArrayStoreException ex)
		{
			System.out.println(ex);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			System.out.println("Finally block executed!!!");
		}
		
		System.out.println("Program Ends!!!");
	}

}
