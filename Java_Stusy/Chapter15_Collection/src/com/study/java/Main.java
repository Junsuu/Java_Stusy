package com.study.java;

import apple.laf.JRSUIUtils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {

        //1. 배열의 불편한점 테스트
        ArrayEx arraytest = new ArrayEx();
        arraytest.testArray();


        //2. 기본 컬렉션 사용법
        ArrayListEx arrayListTest = new ArrayListEx();
        arrayListTest.ArrayListTest();


        //3. Vector 사용법 모두 arrayList와 동일하며, 멀티스레드 환경에서 세이프 하단 차이점만 있다. 그래서 예제는 생략
        List<String> VectorEx = new Vector<>();


        //4. LinkedList 예제 (사용법은 동일하나 속도차이)
        LinkedListEx linkedListEx = new LinkedListEx();
        //순차삽입
        linkedListEx.linkedListSequentialTest();
        //중간에 삽입
        linkedListEx.linkedListmiddleTest();
        //검색
        linkedListEx.linkedListSearchTest();

        //5. HashSet 기본 메소드 및 Iterator 사용법
        HashSetEx hashSetEx = new HashSetEx();
        hashSetEx.HashSetTest();

        //6. Map 테스트
        HashMapEx hashmaptest = new HashMapEx();
        hashmaptest.HashMapExtest();

        //7. HashTable 사용법 모두 HashMap과 동일하며, 멀티스레드 환경에서 세이프 하단 차이점만 있다. 그래서 예제는 생략
        Map<String,String> maptable = new Hashtable<>();

        //8. Properties 예제
        PropertiesEx propertiesEx = new PropertiesEx();
        propertiesEx.propertiesTest();

       //9. TreeSet 예제
        TreeSetEx treeSetEx = new TreeSetEx();
        // TreeSet 검색예제
        treeSetEx.TreeSetfind();
        // TreeSet 정렬
        treeSetEx.TreeSetRange();
        // TreeSet 범위 검색
        treeSetEx.TreeSetRangeSearch();

        //10. TreeMap은 TreeSet과 이름만 바뀌고 키값으로 똑같은 기능을 하는 메소드를 가지고 있어서 생략했습니다.

        //11. Stack 예제
        StackEx stackEx = new StackEx();
        stackEx.StackExtest();

        //12. 큐 예제
        QueueEx queueEx = new QueueEx();
        queueEx.QueueExtest();
    }
}
