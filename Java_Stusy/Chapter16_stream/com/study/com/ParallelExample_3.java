package com.study.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample_3 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("일","이","삼","사","오");
		
		//순차처리
		Stream<String> stream = list.stream();
		stream.forEach(ParallelExample_3 :: print);		
		//(s -> ParallelExample.print(s)와 동일)
		
		System.out.println();
		
		//병렬처리
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(ParallelExample_3 :: print);
		
	}
	public static void print(String str) {
		System.out.println(str + " : " + Thread.currentThread().getName());
	}
}
