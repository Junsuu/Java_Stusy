package com.study.com;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AsDoubleStreamAndBoxedExample_14 {
	public static void main(String[] args) {
		int[] intArray = {1,2,3,4,5};
		
		IntStream intStream = Arrays.stream(intArray);
		intStream.asDoubleStream().forEach(d -> System.out.println(d));
		
		System.out.println();
		
		intStream = Arrays.stream(intArray);
		intStream.boxed().forEach(o -> System.out.println(o.intValue()));
	}
}
