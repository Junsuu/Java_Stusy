package com.study.java;

public class MainThread_2 {
	public static void main(String[] args) {
		Calculator_2 calculator = new Calculator_2();
		
		User1_2 user1 = new User1_2();
		user1.setCalculator(calculator);
		user1.start();
		
		User2_2 user2 = new User2_2();
		user2.setCalculator(calculator);
		user2.start();
	}
}
