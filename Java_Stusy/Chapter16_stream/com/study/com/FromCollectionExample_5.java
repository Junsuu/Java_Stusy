package com.study.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionExample_5 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("일", 10),
				new Student("이", 20),
				new Student("삼", 30)
				);
		
		Stream<Student> stream = list.stream();
		stream.forEach(s -> System.out.println(s.getName()));
	}
}
