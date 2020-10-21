package com.study.com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupingByExample_23 {
	public static void main(String[] args) {
		List<StudentEnum> list = Arrays.asList(
				new StudentEnum("남자1", 10,StudentEnum.Sex.MALE, StudentEnum.City.Seoul),
				new StudentEnum("여자1", 6,StudentEnum.Sex.FEMAIL, StudentEnum.City.Busan),
				new StudentEnum("남자2", 10,StudentEnum.Sex.MALE, StudentEnum.City.Seoul),
				new StudentEnum("여자2", 6,StudentEnum.Sex.FEMAIL, StudentEnum.City.Busan)
				);
		
		Map<StudentEnum.Sex, List<StudentEnum>>mapBySex = list.stream().collect(Collectors.groupingBy(StudentEnum :: getSex));
		
		System.out.print("[남학생]");
		mapBySex.get(StudentEnum.Sex.MALE).stream().forEach(s -> System.out.print(s.getName() + " "));
		
		System.out.print("\n[여학생]");
		mapBySex.get(StudentEnum.Sex.FEMAIL).stream().forEach(s -> System.out.print(s.getName() + " "));
		
		System.out.println();
		
		Map<StudentEnum.City, List<String>> mapByCity = list.stream().collect(
				Collectors.groupingBy(
						StudentEnum :: getCity, Collectors.mapping(StudentEnum :: getName, Collectors.toList())
				)
			);
		System.out.print("\n[서울]");
		mapByCity.get(StudentEnum.City.Seoul).stream().forEach(s -> System.out.print(s + " "));
		
		System.out.print("\n[부산]");
		mapByCity.get(StudentEnum.City.Busan).stream().forEach(s ->System.out.print(s + " "));
	}
}
