package com.javaArrays;

import java.util.ArrayList;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {

		List<Integer> values = new ArrayList<Integer>();

		values.add(20);
		values.add(30);
		values.add(40);
		values.add(50);
		values.add(60);

		for (Object value : values) {
			System.out.println(value);
		}

		System.out.println(values.size());
	}

}
