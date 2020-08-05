package com.study.java;

public class sample7_real extends sample7_abstract {
    //생성자 부분에서 추상 클래스의 생성자를 호출
    public sample7_real(String common_field) {
        super(common_field);
    }

    public void method3(){
        System.out.println("실체클래스 메소드1");
    }
    //추상메소드 오버라이딩을 하지 않았을때 컴파일 에러 발생한다.
    @Override
    public void method4() {
        System.out.println("추상 메소드 오버라이드 내용");
    }
}
