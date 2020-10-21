package com.study.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedListExample_27 {

	//요소처리
	public static void work(int value) {}
	
	
	//병렬처리
	public static long testParallel(List<Integer>list) {
		long start = System.nanoTime();
		list.stream().parallel().forEach((a) -> work(a)); 
		long end = System.nanoTime();
		long runTime = end - start;
	
		System.out.println("testParallel runTime :"+runTime);
		return runTime;
	}
	
	public static void main(String... args) {
		//소스 컬렉션
		List<Integer> arrayList = new ArrayList<Integer>(); 
		List<Integer> likedList = new LinkedList<Integer>(); 
		for (int i = 0; i < 100000; i++) {
			arrayList.add(i);
			likedList.add(i);
		}
		
		//워밍업
		long arrayListParallel = testParallel(arrayList);
		long likedListParallel = testParallel(likedList);
		System.out.println("워밍업------------------------");
		//병렬 스트림 처리 시간 구하기 
		System.out.println("arrayList");
		arrayListParallel = testParallel(arrayList);
		likedListParallel = testParallel(likedList);
		System.out.println("likedList");
		
		if (arrayListParallel < likedListParallel) {
			System.out.println("성능 테스트 결과 : ArrayList 처리가 더빠름");
		}else {
			System.out.println("성능 테스트 결과 : LikedList 처리가 더빠름");
		}
	}
}
