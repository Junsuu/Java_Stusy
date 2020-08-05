package com.study.java2;

public class sample5_child2 extends com.study.java.sample5_parent{

    public void test(){

        // 상속 하지 않으면 접근 불가능
        String test = val;
        sample5_proc();
    }
}
