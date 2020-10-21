package com.study.com;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceExample_4 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("일", 10), new Student("이", 20), new Student("삼", 30));
		
		double avg = list.stream()
			//중간 처리(학생 객체를 점수로 매핑)
				.mapToInt(Student :: getScore)//최종퍼리(평균)
				.average().getAsDouble();
		System.out.println("평균 점수 : " + avg);
	}
}
