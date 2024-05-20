package com.jtc.bean;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableDemo1 {
	
	public static void main(String[] args) {
		Callable callable = () -> {
			for(int i = 100;i<120;i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			return null;
		};
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.submit(callable);
	}

}
