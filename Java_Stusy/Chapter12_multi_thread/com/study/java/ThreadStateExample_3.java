package com.study.java;

public class ThreadStateExample_3 {
	public static void main(String[] args) {
		StateProntThread_3 stateProntThread = new StateProntThread_3(new TargetThread_3());
		stateProntThread.start();
	}
}
