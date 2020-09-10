package com.study.java;

public class User2_2 extends Thread {
	private Calculator_2 calculator;

	

	public void setCalculator(Calculator_2 calculator) {
		this.setName("User2");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(50);;
	}
	
}
