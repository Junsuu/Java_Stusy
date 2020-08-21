package com.study.java;

public class ThreadA extends Thread{
	public ThreadA() {
		setName("ThreadA");
	}
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(getName() + "가 출력한 내용");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
