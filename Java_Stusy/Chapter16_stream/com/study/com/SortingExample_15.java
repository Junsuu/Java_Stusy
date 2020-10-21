package com.study.com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample_15 {
	public static void main(String[] args) {
		IntStream intStream = Arrays.stream(new int[] {5,3,2,4,1});
		intStream.sorted().forEach(n -> System.out.print(n+" "));
		System.out.println();
		
		List<StudentComparable> list = Arrays.asList(
					new StudentComparable("이", 20),
					new StudentComparable("일", 10),
					new StudentComparable("삼", 30)
				);
		
		list.stream().sorted().forEach(s -> System.out.println(s.getScore()));//오름 차순
		System.out.println();
		
		list.stream().sorted( Comparator.reverseOrder()).forEach(s -> System.out.println(s.getScore()));//내림차순\
	}
}
