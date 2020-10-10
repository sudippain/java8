package com.feature.StreamApi;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableFutureDemo {

	public static void main(String[] args) {
		
		//Create The Pool
		ExecutorService service = Executors.newFixedThreadPool(10);	
		
		//Submit The Task For Execution
		for(int i;i<100;i++)
			service.execute(new Task());
		
	}
}
