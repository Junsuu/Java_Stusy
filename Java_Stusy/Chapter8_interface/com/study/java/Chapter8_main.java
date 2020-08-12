package com.study.java;

public class Chapter8_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constant_field rc;
		rc = new implements_test();
		rc = new Audio();
		
		System.out.println("====================TV=====================");
		
		Constant_field tv = null;
		tv = new implements_test();
		tv.turnOn();
		tv.turnOff();
		System.out.println("====================Audio=====================");
		
		tv = new Audio();
		tv.turnOn();
		tv.turnOff();
		
		//디폴트 메서드
		//Constant_field.setMute(true);
		System.out.println("====================디폴트메서드=====================");
		System.out.println("====================TV=====================");
		
		tv.setMute(true);
		System.out.println("====================Audio=====================");
		
		tv = new implements_test();
		tv.setMute(true);
		
		System.out.println("====================정적메서드=====================");
		Constant_field.changeBattery();
		
		System.out.println("====================다형성=====================");
		Car myCar = new Car();
		
		myCar.run();
		System.out.println("====================kumhoTire변경=====================");
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();
		
		System.out.println("====================인터페이스 배열=====================");
		CarExample yourCar = new CarExample();
		yourCar.tires[0] = new KumhoTire();
		yourCar.tires[1] = new KumhoTire();
		yourCar.run();
		System.out.println("====================인터페이스 매개변수의 다형성=====================");
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.driver(bus);
		driver.driver(taxi);
		System.out.println("====================인터페이스 상속=====================");
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA();
		//ia.methodB();
		//ia.methodC();
		System.out.println();
		
		InterfaceB ib = impl;
		//ib.methodA();
		ib.methodB();
		//ib.methodC();
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
		System.out.println("====================인터페이스 디폴트메소드=====================");
		MyInterface mi1 = new MyClassA();
		mi1.method1();
		mi1.method2();
		
		MyInterface mi2 = new MyClassB();
		mi2.method1();
		mi2.method2();
		System.out.println("====================인터페이스 디폴트메소드 상속=====================");
		ChildInterface1 ci1 = new ChildInterface1() {
			
			@Override
			public void method1() {
				// TODO Auto-generated method stub
				System.out.println("ci1 method1 재정의 실행");
			}
			
			@Override
			public void method3() {
				// TODO Auto-generated method stub
				System.out.println("ci1 method3 재정의 실행");
			}
		};
		ci1.method1();
		ci1.method2();
		ci1.method3();
		
		ChildInterface2 ci2 = new ChildInterface2() {
			
			@Override
			public void method1() {
				// TODO Auto-generated method stub
				System.out.println("ChildInterface2-method1 재정의");
			}
			
			@Override
			public void method3() {
				// TODO Auto-generated method stub
				System.out.println("ci2 method3 재정의 실행");
			}
		};
		System.out.println();
		ci2.method1();
		ci2.method2();
		ci2.method3();
		System.out.println();
		ChildInterface3 ci3 = new ChildInterface3() {
			
			@Override
			public void method1() {
				// TODO Auto-generated method stub
				System.out.println("ChildInterface3-method1 재정의");
			}
			
			@Override
			public void method3() {
				// TODO Auto-generated method stub
				System.out.println("ChildInterface3-method3 재정의");
			}
			
			@Override
			public void method2() {
				// TODO Auto-generated method stub
				System.out.println("ChildInterface3-method2 재정의");
			}
		};
		
		ci3.method1();
		ci3.method2();
		ci3.method3();
	}

}
