package com.study.java;

import java.io.IOException;

public class sample2_parent {

    String test;

    // 1. 생성자 선언 안했을때

    // 2. 매개변수 있는 생성자 선언했을때
    public sample2_parent(String test){
        this.test = test;
        System.out.println("parent생성자 정상 호출되었습니다.");
    }

    // 기본 오버라이드 예제
    public void overrideSample1(){
        System.out.println("부모 메소드 호출");
    }

    // 부모메소드 동일 시그니처 exception 예제 + 접근제한 + exception
    String overrideSample2(String test) throws IOException {
        this.test = test;
        return test;
    }
}
