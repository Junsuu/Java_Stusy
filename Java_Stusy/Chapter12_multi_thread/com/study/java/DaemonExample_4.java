package com.study.java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DaemonExample_4 {
	public static void main(String[] args) {
		AutoSaveThread_4 autoSaveThread = new AutoSaveThread_4();
		autoSaveThread.setDaemon(true);
		autoSaveThread.isDaemon();
		System.out.println("데몬스레드야?:"+autoSaveThread.isDaemon());
		autoSaveThread.start();
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		
		}
		System.out.println("메인 스레드 종료");
	}
}
