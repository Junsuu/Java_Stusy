package com.study.java;

public class Car {
	Tire frontLeftTire= new HankooTire();
	Tire frontRightTire= new HankooTire();
	Tire backLeftTire= new HankooTire();
	Tire bacRightTire= new HankooTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		bacRightTire.roll();
	}
}
