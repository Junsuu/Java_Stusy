package com.study.com;

import java.util.Arrays;
import java.util.List;

public class MapExample_13 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
					new Student("일", 10),
					new Student("이", 20),
					new Student("삼", 30)
				);
		
		list.stream().mapToInt(Student :: getScore).forEach(score -> System.out.println(score));
	}
}
