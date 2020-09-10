package com.study.java;

public class AutoSaveThread_4 extends Thread{
	public void save() {
		System.out.println("작업 내용을 저장함.");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				break;
			}
			save();
		}
	}
}
