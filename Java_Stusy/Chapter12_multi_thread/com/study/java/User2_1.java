package com.study.java;

public class User2_1 extends Thread {
	private Calculator_1 calculator;

	

	public void setCalculator(Calculator_1 calculator) {
		this.setName("User2");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(50);
	}
	
}
