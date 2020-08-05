package com.study.java;

import java.io.IOException;

public class sample2_child extends sample2_parent {

    String no;

    //매개 변수 있는 생성자 선언했을때
    public sample2_child(String test) {
        //super를 첫줄에 선언 안했을시 exception
        //no = "test";
        super(test);
    }

    //기본 오바라이드 예제
    @Override
    public void overrideSample1() {
        System.out.println("자식 메소드 호출");
        //부모 생성자 호출이 필요할때
        super.overrideSample1();
    }
    // 부모메소드 동일 시그니처 exception 예제 + 접근제한 + exception 예제
    @Override
    public String overrideSample2(String test) throws IOException {
        return "test 완료";
    }
}
