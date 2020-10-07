package com.study.java;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx {

    public void TreeSetfind(){
        TreeSet<Integer> scores = new TreeSet<Integer>();
        scores.add(new Integer(87));
        scores.add(new Integer(98));
        scores.add(new Integer(75));
        scores.add(new Integer(95));
        scores.add(new Integer(80));

        Integer score = null;

        score = scores.first();
        System.out.println("가장 낮은 점수 : " + score);

        score = scores.last();
        System.out.println("가장 높은 점수 : " + score);

        score = scores.lower(new Integer(95));
        System.out.println("95점 아래 점수 : " + score);

        score = scores.higher(new Integer(95));
        System.out.println("95점 위의 점수 : " + score);

        score = scores.floor(new Integer(95));
        System.out.println("95점이거나 바로 아래 점수 : " + score);

        score = scores.ceiling(new Integer(85));
        System.out.println("85점이거나 바로 위 점수 : " + score);

        while (!scores.isEmpty()){
            score = scores.pollFirst();
            System.out.println(score + "(남은 객체 수 :" +scores.size()+")");
        }
    }

    public void TreeSetRange(){
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(new Integer(87));
        scores.add(new Integer(98));
        scores.add(new Integer(75));
        scores.add(new Integer(95));
        scores.add(new Integer(80));

        // 내림차순 정렬
        NavigableSet<Integer> descendingSet = scores.descendingSet();
        for(Integer score : descendingSet){
            System.out.print(score + " ");
        }
        System.out.println();

        // 2번 호출로 오름차순
        NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
        for(Integer score : ascendingSet){
            System.out.println(score + " ");
        }
    }

    public void TreeSetRangeSearch(){
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("apple");
        treeSet.add("forever");
        treeSet.add("description");
        treeSet.add("ever");
        treeSet.add("zoo");
        treeSet.add("base");
        treeSet.add("guess");
        treeSet.add("cherry");

        System.out.println("[ c ~ f 사이의 단어 검색 ]");
        NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f",true);
        for(String word : rangeSet){
            System.out.println(word);
        }
    }
}
