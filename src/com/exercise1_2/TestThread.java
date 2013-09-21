package com.exercise1_2;

import java.util.ArrayList;

public class TestThread implements Runnable{
		NumberObject num ;
		public static ArrayList<NumberObject> doubleObject = new ArrayList<NumberObject>();
		double number ;
		public TestThread() {
			// TODO Auto-generated constructor stub
			num = new NumberObject();
		}
		@Override
	public void run() {
			num = new NumberObject();
			doubleObject.add(num);
			NumberObject n1 = new NumberObject() ;
			System.out.println(n1.getNumber());
	}
	
	private double randomizeNumber (){
		for (int index = 0 ; index < 10 ; index ++){
			number += 1 + Math.random() * 10 ;
		}
		return number;
	}
	
	public double getNumber (){
		return number ;
	}
	
	public static void main(String[] args) {
		
		TestThread t1 = new TestThread();
		TestThread t2 = new TestThread();
		TestThread t3 = new TestThread();
		TestThread t4 = new TestThread();
		TestThread t5 = new TestThread();
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		Thread thread3 = new Thread(t3);
		Thread thread4 = new Thread(t4);
		Thread thread5 = new Thread(t5);
		thread1.start();
		thread1.yield();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		System.out.println(t1.num.getNumber() + t2.num.getNumber() + t3.num.getNumber() + t4.num.getNumber() + t5.num.getNumber());
		for (int index = 0 ; index < t1.doubleObject.size() ; index ++){
			System.out.print(t1.doubleObject.get(index).getNumber()+"\t");
		}
	}

}
class NumberObject {
	
	double number ;
	
	public NumberObject() {
		// TODO Auto-generated constructor stub
		number = 0 ;
		randomizeNumber();
	}
	
	private void randomizeNumber (){
		for (int index = 0 ; index < 10 ; index ++){
			number += 1 +Math.random() * 10 ;
		}
	}
	public double getNumber (){
		return number;
	}
}