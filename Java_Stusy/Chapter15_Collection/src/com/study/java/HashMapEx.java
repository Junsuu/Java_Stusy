package com.study.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public void HashMapExtest(){
        Map<String,String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");
        map.put("5", "5");

        // Map순회방법 1
        System.out.println("Map 순회방법 1 keySet");
        Set<String> keyset = map.keySet();
        Iterator<String> iterator = keyset.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            String value = map.get(key);
            System.out.println("Key : " + key + " Value : " + value);
        }
        map.remove("1");
        map.remove("2");
        map.put("3", "1");
        map.put("4", "2");
        map.put("5", "3");

        // Map순회방법 2
        System.out.println("Map 순회방법 2 entrySet");
        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        Iterator<Map.Entry<String,String>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()){
            Map.Entry<String,String> entry = entryIterator.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key : " + key + " Value : " + value);
        }

        // 재정의 객체를 key값으로 사용
        System.out.println("재정의한 객체를 키값으로 사용 예제");
        Map<HashMapExStudent,Integer> map2 = new HashMap<>();
        map2.put(new HashMapExStudent(1, "홍길동"), 95);
        map2.put(new HashMapExStudent(1, "홍길동"), 95);
        map2.put(new HashMapExStudent(2, "홍길동"), 100);
        map2.put(new HashMapExStudent(1, "동길홍"), 100);
        System.out.println("총 entry의 수 : " + map2.size());
    }
}
