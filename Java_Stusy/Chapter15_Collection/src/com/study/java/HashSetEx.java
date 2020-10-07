package com.study.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
    public void HashSetTest(){

        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");

        // Iterator로 set 순회
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            if(str.equals("2")){
                // iterator.remove 메소드는 실제 컬렉션의 객체를 삭제한다 따라서 밑에서 순회할때 값 x
                iterator.remove();
            }
            System.out.println(str);
        }
        // 향상된 for문으로 순회
        for(String str : set){
            System.out.println(str);
        }

        //HashSet 기본 메소드
        Set<String> settest = new HashSet<String>();
        settest.add("1");
        settest.add("2");
        settest.add("3");
        settest.add("4");
        settest.add("5");

        int size = settest.size();
        System.out.println("총 객체 수 : " + size);

        Iterator<String> iteratortest = settest.iterator();
        while (iteratortest.hasNext()){
            String element = iteratortest.next();
            System.out.println("\t" + element);
        }

        settest.remove("1");
        settest.remove("2");
        // 중복값을 추가하여도 총 객체의 수는 증가하지 않는다.
        settest.add("5");
        System.out.println("총 객체 수 : " + settest.size());
        iteratortest = settest.iterator();
        while(iteratortest.hasNext()){
            String element = iteratortest.next();
            System.out.println("\t" + element);
        }

        settest.clear();
        if(settest.isEmpty()){
            System.out.println("비워져있음");
        }
    }
}
