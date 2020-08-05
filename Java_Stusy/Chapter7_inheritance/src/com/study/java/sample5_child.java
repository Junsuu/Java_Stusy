package com.study.java;

public class sample5_child {
    String childval;

    public sample5_child(){}

    public void sample(){
        sample5_parent parent = new sample5_parent();

        //protected 접근가능
        System.out.println(parent.val);
        parent.sample5_proc();
    }
}
