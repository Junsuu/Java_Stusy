package com.study.com;

import java.util.Arrays;

public class AggregateExample_18 {
	public static void main(String[] args) {
		long count = Arrays.stream(new int[] {1,2,3,4,5}).filter(n -> n%2==0).count();
		System.out.println("2의 배수 개수: "+ count);
		
		long sum = Arrays.stream(new int[] {1,2,3,4,5}).filter(n -> n%2==0).sum();
		System.out.println("2의 배수 합: "+ sum);
		
		double avg = Arrays.stream(new int[] {1,2,3,4,5}).filter(n -> n%2==0).average().getAsDouble();
		System.out.println("2의 배수 평균: "+ avg);
		
		int max = Arrays.stream(new int[] {1,2,3,4,5}).filter(n -> n%2==0).max().getAsInt();
		System.out.println("최대값: "+ max);
		
		int min = Arrays.stream(new int[] {1,2,3,4,5}).filter(n -> n%2==0).min().getAsInt();
		System.out.println("최소값: "+ min);

		int first = Arrays.stream(new int[] {1,2,3,4,5}).filter(n -> n%3 ==0).findFirst().getAsInt();
		System.out.println("첫번째 3의 배수: " + first);
		
	}
}