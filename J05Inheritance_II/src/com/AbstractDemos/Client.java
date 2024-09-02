package com.AbstractDemos;

public class Client {

	public static void main(String[] args) {
		//Shape s1 = new Shape();
		Shape s1 = new Circle(5);
		s1.calculateArea();
		
		Rectangle r1 = new Rectangle(5,  7);
		r1.calculateArea();
		r1.print();
		
		//Printable p1 = new Printable();
		Printable p1 = new Circle(6);
		p1.print();
		
		Circle c1 = new Circle(5);
		c1.print();
	}

}
