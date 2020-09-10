package com.study.java;

public class MainThread_1 {
	public static void main(String[] args) {
		Calculator_1 calculator = new Calculator_1();
		
		User1_1 user1 = new User1_1();
		user1.setCalculator(calculator);
		user1.start();
		
		User2_1 user2 = new User2_1();
		user2.setCalculator(calculator);
		user2.start();
	}
}
