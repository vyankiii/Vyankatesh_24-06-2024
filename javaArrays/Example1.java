package com.javaArrays;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {

		// Variable must provide either dimension expressions or an array initializer
		int arrays[] = new int[4];

		arrays[0] = 20;
		arrays[1] = 30;
		arrays[2] = 40;
		arrays[3] = 67;

		for (int value : arrays) {
			System.out.println(value);
		}

		System.out.println("------------------------------");

		List values = new ArrayList();

		values.add(20);
		values.add(30);
		values.add(40);
		values.add(50);
		values.add(60);
		values.add(new Student());

		for (Object value : values) {
			System.out.println(value);
		}
		System.out.println("------------------------------");
		values.remove(3);
		for (Object value : values) {
			System.out.println(value);
		}
		System.out.println("------------------------------");
		values.add(true);
		values.add("hello");
		for (Object value : values) {
			System.out.println(value);
		}

		System.out.println("------------------------------");

		System.out.println(arrays.length);
		System.out.println(values.size());
	}

}
