package com.study.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {

    public void ArrayListTest(){
        //2. 기본 컬렉션 사용법
        List<String> list = new ArrayList<String>(30);

        //결과 boolean값으로 return
        boolean result = list.add("1");
        System.out.println(result);
        list.remove("1");

        list.add(0,"1");
        list.remove(0);

        // set / isEmpty
        list.add("1");
        list.set(0, "set");
        for(int i =0; i < list.size();i++){
            System.out.println(list.get(i));
        }
        list.remove(0);
        if(list.isEmpty()){
            System.out.println("리스트 아무것도 없습니다");
        }
        // list.clear
        for(int i = 0; i < 10; i++){
            list.add("String" +i);
        }
        if(list.contains("String0")){
            list.clear();
        }

        //Arrays.asList
        String[] testarr = {"1","2","3","4","5"};
        list = Arrays.asList(testarr);
        for(int i = 0; i < list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
