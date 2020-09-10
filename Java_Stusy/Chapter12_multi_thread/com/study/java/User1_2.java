package com.study.java;

public class User1_2 extends Thread{
	private Calculator_2 calculator;

	

	public void setCalculator(Calculator_2 calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(100);;
	}
	
}
