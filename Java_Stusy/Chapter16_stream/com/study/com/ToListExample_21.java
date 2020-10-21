package com.study.com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.study.com.StudentEnum.Sex;

public class ToListExample_21 {
	public static void main(String[] args) {
		List<StudentEnum> list = Arrays.asList(
					new StudentEnum("남자1", 10,StudentEnum.Sex.MALE),
					new StudentEnum("여자1", 6,StudentEnum.Sex.FEMAIL),
					new StudentEnum("남자2", 10,StudentEnum.Sex.MALE),
					new StudentEnum("여자2", 6,StudentEnum.Sex.FEMAIL)
				);
		
		//남학생만 묶어 list
		List<StudentEnum> maleList = list.stream().filter(s -> s.getSex() == Sex.MALE).collect(Collectors.toList());
		maleList.stream().forEach(s -> System.out.println(s.getName()));
		System.out.println();
		//여학생만 묶어 HashSet
		Set<StudentEnum> femaleList = list.stream().filter(s -> s.getSex() == Sex.FEMAIL).collect(Collectors.toCollection(HashSet :: new));
		femaleList.stream().forEach(s -> System.out.println(s.getName()));
		
	}
}
