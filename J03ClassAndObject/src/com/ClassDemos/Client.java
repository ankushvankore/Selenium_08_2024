package com.ClassDemos;

public class Client {

	public static void main(String[] args) {
		MyDate d1 = new MyDate();
		//MyDate -> Data type, d1 -> Object of type MyDate
		d1.setDay(28);
		d1.setMonth("August");
		d1.setYear(2024);
		
		d1.displayDate();
		int d = d1.getDay();
		System.out.println("Day: " + d);
		
		MyDate d2 = new MyDate();
		//d2.setDate();
		d2.displayDate();
		
		MyDate nBd = new MyDate(1, "August", 2001);
		nBd.displayDate();
		
		MyDate cBd = new MyDate(1, "May");
		cBd.displayDate();
		
		MyDate pBd = new MyDate(8, "Sept");
		pBd.displayDate();
		
	}

}
