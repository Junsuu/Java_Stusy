package com.study.com;

import java.util.Arrays;
import java.util.List;

import com.study.com.StudentEnum.Sex;

public class MaleStudentExample_25 {
	public static void main(String[] args) {
		List<StudentEnum> list = Arrays.asList(
				new StudentEnum("남자1", 10,StudentEnum.Sex.MALE),
				new StudentEnum("여자1", 6,StudentEnum.Sex.FEMAIL),
				new StudentEnum("남자2", 10,StudentEnum.Sex.MALE),
				new StudentEnum("여자2", 6,StudentEnum.Sex.FEMAIL)
			);
		
		MaleStudent maleStudent = list.parallelStream()
				.filter(s -> s.getSex() == Sex.MALE)
				.collect(MaleStudent :: new, MaleStudent :: accmulate, MaleStudent :: combine);
		
		maleStudent.getList().stream().forEach(s -> System.out.println(s.getName()));
	}
}
