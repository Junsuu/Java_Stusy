package com.study.java;

public class TargetThread_3 extends Thread {
	public void run() {
		for (int i = 0; i < 100000; i++) {
			
		}
		try {
			//1.5초간 일시 정지
			Thread.sleep(1500);
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (long i = 0; i < 100000; i++) {
			
		}
	}
}
