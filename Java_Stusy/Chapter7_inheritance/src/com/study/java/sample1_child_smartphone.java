package com.study.java;

public class sample1_child_smartphone extends sample1_parent_cellphone {

    boolean touched = false;

    public sample1_child_smartphone(String model, String color, boolean touched){
        this.model = model;
        this.color = color;
        this.touched = touched;
    }

    void touchedScreen(boolean touched){
        if(touched == true){
            System.out.println("화면 터치되었다!");
        }else {
            System.out.println("화면 터지 안했다!");
        }
    }
}
