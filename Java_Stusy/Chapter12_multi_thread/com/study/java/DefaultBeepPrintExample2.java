package com.study.java;

import java.awt.Toolkit;

public class DefaultBeepPrintExample2 {
	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for (int i = 0; i < 5; i++) {
				toolkit.beep();
				try {
					System.out.println("삥");
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			
		});
	thread.start();
	}
}
