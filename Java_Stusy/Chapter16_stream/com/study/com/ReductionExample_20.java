package com.study.com;

import java.util.Arrays;
import java.util.List;

public class ReductionExample_20 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
					new Student("일", 95),
					new Student("이", 92),
					new Student("삼", 88)
				);
		
		int sum1 = list.stream().mapToInt(Student :: getScore).sum();

		int sum2 = list.stream().map(Student :: getScore).reduce((a,b) -> a+b).get();
		
		int sum3 = list.stream().map(Student :: getScore).reduce(0, (a, b) -> a+b);
		
		System.out.println("sum1: " + sum1);
		System.out.println("sum2: " + sum2);
		System.out.println("sum3: " + sum3);
	}
}
