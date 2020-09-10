package com.study.java;

public class Calculator_2 {
	private int memory;
	
	public int getMemory() {
		return memory;
	}

//	public synchronized void setMemory(int memory) {
//		this.memory = memory;
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			
//		}
//		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
//	}
	//둘다 가능
	public  void setMemory(int memory) {
		synchronized(this) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);	
		}
	}
}
