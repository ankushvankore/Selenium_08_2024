package com.CollectionDemos;

import java.util.ArrayList;
import java.util.List;

public class D01ListDemo1 {

	public static void main(String[] args) {
		List<String>students = new ArrayList<>();
		
		students.add("Priyanka");
		students.add("Chaitrali");
		students.add("Nandkumar");
		students.add("Chaitrali");
		
		System.out.println("Total students: " + students.size());
		
		System.out.println(students.get(2));
		
		System.out.println(students);
		
		for(int i = 0; i < students.size(); i++)
			System.out.println(students.get(i));
		
		System.out.println("------------------------------");
		
		for(String st : students)
			System.out.println(st);
	}

}
