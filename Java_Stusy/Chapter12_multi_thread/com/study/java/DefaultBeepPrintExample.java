package com.study.java;

import java.awt.Toolkit;

public class DefaultBeepPrintExample {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					System.out.println("땡");
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
			}
		});
	thread.start();
	}
}
