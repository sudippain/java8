package com.feature.StreamApi;



public class ThreadDemoUsingRunnableInterfaceDemo implements Runnable{

	@Override
	public void run() {
		for(int i =0;i<10;i++)
			System.out.println(i);
		
	}
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new ThreadDemoUsingRunnableInterfaceDemo());
		
		t1.start();
		System.out.println("This is from main");
		
	}

}
