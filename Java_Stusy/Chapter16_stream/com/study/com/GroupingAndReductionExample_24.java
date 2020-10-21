package com.study.com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAndReductionExample_24 {
	public static void main(String[] args) {
		List<StudentEnum> list = Arrays.asList(
					new StudentEnum("남자1", 10,StudentEnum.Sex.MALE),
					new StudentEnum("여자1", 6,StudentEnum.Sex.FEMAIL),
					new StudentEnum("남자2", 10,StudentEnum.Sex.MALE),
					new StudentEnum("여자2", 6,StudentEnum.Sex.FEMAIL)
				);
		//성별로 평균 점수를 저장하는 Map 얻기
		Map<StudentEnum.Sex, Double> mapBySex = list.stream()
				.collect(
						Collectors.groupingBy(StudentEnum :: getSex, Collectors.averagingDouble(StudentEnum :: getScore)
								)
						);
		
		System.out.println("남학생 평균 점수: " + mapBySex.get(StudentEnum.Sex.MALE));
		System.out.println("여학생 평균 점수: " + mapBySex.get(StudentEnum.Sex.FEMAIL));
		
		//성별을 쉼표로 구분한 이름을 저장하는 Map 얻기
		Map<StudentEnum.Sex, String> mapByName = list.stream()
				.collect(
						Collectors.groupingBy(StudentEnum :: getSex, Collectors.mapping(StudentEnum :: getName, Collectors.joining(",")
								)
							)
						);
		System.out.println("남학생 전체 이름: " + mapByName.get(StudentEnum.Sex.MALE));
		System.out.println("여학생 전체 이름: " + mapByName.get(StudentEnum.Sex.FEMAIL));
				
				
	}
}
