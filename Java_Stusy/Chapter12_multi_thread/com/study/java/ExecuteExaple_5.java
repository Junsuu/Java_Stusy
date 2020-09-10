package com.study.java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteExaple_5 {
	public static void main(String[] args)throws Exception{
		ExecutorService executorService = Executors.newFixedThreadPool(2); // 최대스레드 개수가 2인 스레풀 생성
		
		for (int i = 0; i < 10; i++) {
			Runnable runnable = new Runnable() {
				
				@Override
				public void run() {
					//스레드 총 개수 및 작업 스레드 이름 출력
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
					int poolSize = threadPoolExecutor.getPoolSize();
					String thread = Thread.currentThread().getName();
					System.out.println("[총 스레드 개수: " + poolSize + "] 작업 스레드 이름: " + thread);
					//예외 발생 시킴
					int value = Integer.parseInt("삼");
				}
			};
			//executorService.execute(runnable);
			executorService.submit(runnable);
			
			Thread.sleep(10);
		}
		executorService.shutdown(); // 스레드풀 종료
	}
}
