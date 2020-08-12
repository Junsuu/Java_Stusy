package com.study.java;

public class MyClassB implements MyInterface{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("MyClassB-method1() 실행");
	}
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("MyClassB-method2() 실행");
		System.out.println("=아래는 인터페이스의 디폴트 메소드=");
		 MyInterface.super.method2();
	}

}
