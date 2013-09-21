package com.testThread;

import java.util.Timer;

public class Task1 {

	public static void main(String[] args) {

		Runnable a = new PrintA();
		Runnable b = new PrintB(15);
		Runnable c  = new PrintC('a', 10);
		
		Thread thread = new Thread(a);
		Thread thread2 = new Thread(b);
		Thread thread3 = new Thread(c);
		
//		thread.run();
//		thread2.run();
//		thread3.run();
		thread.start();
		thread2.start();
		thread3.start();
		
	}
}

	class PrintA implements Runnable {

		char a, b;

		public PrintA() {

			a = 'a';
			b = 'b';
		}

		public PrintA(char a, char b) {
			this.a = a;
			this.b = b;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int index = 0; index < 20; index++) {
				System.out.print(a + b+"\t");
				if (index < 10)
					try {
						Thread.sleep(4000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		}

	}

	class PrintB implements Runnable {

		int n;

		public PrintB(int n) {

			this.n = n;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int index = 0; index < 10; index++) {
				System.out.print(" " + n);
			}
		}

	}

	class PrintC implements Runnable {

		char a;
		int c;

		public PrintC(char a, int c) {

			this.a = a;
			this.c = c;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int index = 0; index < c; index++) {
				System.out.print(" " + a);
			}

		}

	}

