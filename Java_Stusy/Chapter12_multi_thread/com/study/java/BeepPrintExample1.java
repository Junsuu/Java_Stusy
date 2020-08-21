package com.study.java;

import java.awt.Toolkit;

public class BeepPrintExample1 {
	public static void main(String[] args) {
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	for(int i=0; i<5; i++) {
		toolkit.beep();
		System.out.println("땡");
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	for (int i = 0; i < 5; i++) {
		System.out.println("띵");
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
}
