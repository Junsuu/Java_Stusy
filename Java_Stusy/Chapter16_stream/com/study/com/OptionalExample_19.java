package com.study.com;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample_19 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		/*예외 발생(java.util.NoSuchElementException))*/
//		double avg = list.stream().mapToInt(Integer :: intValue).average().getAsDouble();
		
		OptionalDouble optionalDouble = list.stream().mapToInt(Integer :: intValue).average();
		if (optionalDouble.isPresent()) {
			System.out.println("방법 1 평균 : " + optionalDouble.getAsDouble());
		}else {
			System.out.println("방법 1 평균 : 0.0");
		}
		
		double avg = list.stream().mapToInt(Integer :: intValue).average().orElse(0.0);
		System.out.println("방법 2 평균 : "+ avg);
		
		list.stream().mapToInt(Integer :: intValue).average().ifPresent(a -> System.out.println("방법 3 평균 : "+ a));
	}
}
