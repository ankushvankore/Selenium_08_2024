package com.CollectionDemos;

import java.util.ArrayList;
import java.util.List;

public class D02ListDemo2 {

	public static void main(String[] args) {
		List<Integer>numbers = new ArrayList<>();
		numbers.add(10);
		
		
		for(int n : numbers)
			System.out.println(n);
		
	}

}
