package com.study.com;

import java.util.Arrays;
import java.util.List;

public class StreamPipelinesExample_10 {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
					new Member("남자1", Member.MALE, 30 ),
					new Member("여자1", Member.FEMALE, 20 ),
					new Member("남자2", Member.MALE, 45 ),
					new Member("여자2", Member.FEMALE, 27 )
				);
		
		double ageAvg = list.stream()
				.filter(m -> m.getSex() == Member.MALE)
				.mapToInt(Member :: getAge)
				.average()
				.getAsDouble();
		
		double ageAvgf = list.stream()
				.filter(m -> m.getSex() == Member.FEMALE)
				.mapToInt(Member :: getAge)
				.average()
				.getAsDouble();
		
		System.out.println("남자 평균 나이: " + ageAvg);
		System.out.println("여자 평균 나이: " + ageAvgf);
	}
}
