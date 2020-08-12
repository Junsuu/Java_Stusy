package com.study.java;

public interface ChildInterface2 extends ParentInterface{
	
	@Override
	default void method2() {
		// TODO Auto-generated method stub
	System.out.println("ChildInterface2-method2 재정의");
	
	
	}

	public void method3();

}
