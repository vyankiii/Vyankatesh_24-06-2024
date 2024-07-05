package com.javaArrays;

import java.util.ArrayList;
import java.util.List;

public class Example3 {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<Student>();

		students.add(new Student(121, "A1"));
		students.add(new Student(122, "A2"));
		students.add(new Student(223, "A3"));
		students.add(new Student(667, "A4"));
		students.add(new Student(782, "A10"));

		for (Student student : students) {
			System.out.println(student.toString());
		}

	}

}
