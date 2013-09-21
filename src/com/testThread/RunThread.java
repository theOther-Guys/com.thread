package com.testThread;

public class RunThread {
	
	public static void main(String[] args) {
		
		PrintA a = new PrintA();
		Thread thread = new Thread(a);
		PrintB b = new PrintB(10);
		Thread thread2 = new Thread(b);
		
		thread.start();
		thread2.start();
	}

}
