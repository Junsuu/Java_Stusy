package com.study.java;

public abstract class sample7_abstract {
    public String common_field;

    public sample7_abstract(String common_field){
        this.common_field = common_field;
    }

    public void method1(){
        System.out.println("메소드 1 공통속성");
    }
    public void method2(){
        System.out.println("메소드 2 공통속성");
    }
    //추상메소드 {}중괄호 실행 블럭이 없다!
    public abstract void method4();
}
