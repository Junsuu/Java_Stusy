package com.study.java;

public class sample6_child2 extends sample6_parent{
    public void child2method(){
        System.out.println("child2method");
    }

    @Override
    public void parentmethod(){
        System.out.println("Override된 자식 객체 선언");
    }
}
