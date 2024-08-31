package com.InheritanceDemos;

public class StringClassDemo
{

	public static void main(String[] args) {
		//String str = new String("Nandkumar");
		String str = "Nandkumar";
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(3));
		
		System.out.println("Index of k: " + str.indexOf('k'));
		
		System.out.println("Length of String: " + str.length());
		
		String uStr = str.toUpperCase();
		System.out.println("Upper Case: " + uStr);
		
		String lStr = uStr.toLowerCase();
		System.out.println("Lower Case: " + lStr);
		
		String rStr = str.replace('a', 'A');
		System.out.println("String after replacement: " + rStr);
		
		if(str.contains("kumar"))
			System.out.println("String contains kumar");
		else
			System.out.println("String dosent contains kumar");
		
		String str1 = "Chaitrali", str2 = "chaitrali";
		
		//if(str1 == str2)
		if(str1.equals(str2))
			System.out.println("Both are equal");
		else
			System.out.println("Both are not equal");
		
		if(str1.equalsIgnoreCase(str2))
			System.out.println("Both are equal ignoring case");
		else
			System.out.println("Both are NOT equal ignoring case");

		int cnt = 0;
		
		for(int i = 0; i < str1.length(); i++)
		{
			if(str1.charAt(i) == 'i')
				cnt++;
		}
		
		System.out.println("Total count of i: " + cnt);
	}

}
