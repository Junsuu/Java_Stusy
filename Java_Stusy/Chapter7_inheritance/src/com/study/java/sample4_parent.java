package com.study.java;

// class final 선언시 상속불가
public class sample4_parent {
    final String finalValue = "수정불가!";

    public final void samplFinal(){
        //finalValue = "수정시도";
        System.out.println("오버라이드 불가 메소드");
    }
}
