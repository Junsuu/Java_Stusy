package com.study.java;

public class ArrayEx {

    public void testArray(){
        // 배열 초기화시 크기 고정
        String [] arrex = new String[10];

        for(int i = 0; i < arrex.length;i++){
            arrex[i] = "String"+i;
        }
        // 배열 중간값 삭제
        arrex[3] = null;

        for(int i = 0; i < arrex.length;i++){
            System.out.println(i+"번째 인덱스 : "+arrex[i]);
        }
        // 배열에 빈곳에 값 입력
        for(int i = 0; i <arrex.length;i++){
            if(arrex[i] == null){
                System.out.println("====== 비어있는 인덱스 찾기 ======");
                System.out.println(i+"번째 인덱스에 null 값");
                // 값 추가 코드
                arrex[i] = "String" +i;
            }
        }
    }
}
