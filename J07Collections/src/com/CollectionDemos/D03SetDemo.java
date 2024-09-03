package com.CollectionDemos;

import java.util.HashSet;
import java.util.Set;

public class D03SetDemo {

	public static void main(String[] args) {
		Set<String> students = new HashSet<>();
		
		students.add("Priyanka");
		students.add("Chaitrali");
		students.add("Nandkumar");
		students.add("Chaitrali");
		students.add("Ankush");
		
		System.out.println("Total students: " + students.size());
		
		System.out.println(students);
		
		for(String s : students)
			System.out.println(s);
		
	}

}
