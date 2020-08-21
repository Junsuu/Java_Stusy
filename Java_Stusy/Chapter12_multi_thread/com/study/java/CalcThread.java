package com.study.java;

public class CalcThread extends Thread{
	public CalcThread(String name) {
		setName(name);
	}
	
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(getName());
		}
	}
}
