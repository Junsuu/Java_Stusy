package com.study.java;

import java.util.ArrayList;
import java.util.*;

public class LinkedListEx {

    // 100000개 이하는 linkedlist가 더빠르다. 횟수가 많아질수록 ArrayList가 빨라짐
    public void linkedListSequentialTest(){
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        long StartTime;
        long EndTime;

        StartTime = System.nanoTime();
        for(int i = 0; i < 1000000;i++){
            list1.add(String.valueOf(i));
        }
        EndTime = System.nanoTime();
        System.out.println("ArrayList 순차 테스트 : " + (EndTime - StartTime) + "ns");

        StartTime = System.nanoTime();
        for(int i = 0; i < 1000000;i++){
            list2.add(String.valueOf(i));
        }
        EndTime = System.nanoTime();
        System.out.println("LinkedList 순차 테스트 : " + (EndTime - StartTime) + "ns");
    }

    public void linkedListmiddleTest(){
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        long StartTime;
        long EndTime;

        StartTime = System.nanoTime();
        for(int i = 0; i < 100000;i++){
            list1.add(0,String.valueOf(i));
        }
        EndTime = System.nanoTime();
        System.out.println("ArrayList 중간삽입 테스트 : " + (EndTime - StartTime) + "ns");

        StartTime = System.nanoTime();
        for(int i = 0; i < 100000;i++){
            list2.add(0,String.valueOf(i));
        }
        EndTime = System.nanoTime();
        System.out.println("LinkedList 중간삽입 테스트 : " + (EndTime - StartTime) + "ns");

    }
    public void linkedListSearchTest(){
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        long StartTime;
        long EndTime;
        int a = 0;

        for(int i = 0; i < 10000;i++){
            list1.add(String.valueOf(i));
        }
        StartTime = System.nanoTime();
        for(int i = 0; i <list1.size();i++){
            a = Integer.parseInt(list1.get(i));
        }
        EndTime = System.nanoTime();
        System.out.println("ArrayList 검색 테스트 : " + (EndTime - StartTime) + "ns");

        for(int i = 0; i < 10000;i++){
            list2.add(String.valueOf(i));
        }
        StartTime = System.nanoTime();
        for(int i = 0; i <list2.size();i++){
            a = Integer.parseInt(list2.get(i));
        }
        EndTime = System.nanoTime();
        System.out.println("LinkedList 검색 테스트 : " + (EndTime - StartTime) + "ns");

    }
}
