package com.study.java;

import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallbackExample_8 {
	private ExecutorService executorService;
	
	public CallbackExample_8() {
		executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
	}
	private	CompletionHandler<Integer, Void> callback = new CompletionHandler<Integer, Void>() {
		
		@Override
		public void failed(Throwable exc, Void attachment) {
			System.out.println("failed() 실행: " + exc.toString());
		}
		
		@Override
		public void completed(Integer result, Void attachment) {
			System.out.println("completed() 실행 :" + result);
		}
	};
	
	public void doWork(final String x, final String y) {
		Runnable task = new Runnable() {
			
			@Override
			public void run() {
				try {
					int intX = Integer.parseInt(x);
					int intY = Integer.parseInt(y);
					int result = intX + intY;
					callback.completed(result, null);
				} catch (Exception e) {
					callback.failed(e, null);
				}
			}
		};
		executorService.submit(task);
	}
	public void finish() {
		executorService.shutdown();
	}
	public static void main(String[] args) {
		CallbackExample_8 example = new CallbackExample_8();
		example.doWork("3", "3");
		//example.doWork("3", "삼");
		example.finish();
	}
}
