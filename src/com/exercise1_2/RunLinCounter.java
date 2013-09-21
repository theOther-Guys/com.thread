package com.exercise1_2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;

public class RunLinCounter {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		input.useDelimiter(" ");
		ArrayList<String> path = new ArrayList<String>();
		System.out.println(" please type exit to exit");
		while (!input.nextLine().equals("exit")) {
			System.out
					.println(" please type a file name to counter for the lines in it :");
			path.add(input.nextLine());

		}
		multiThreaded(path);

		singleThread(path);
	}

	public static void singleThread(ArrayList<String> str) {
		System.out.println(" single threaded the tiem is : " + System.currentTimeMillis());

		LineCounter ln = new LineCounter(str);

		System.out.println(" single threaded the tiem is : " + System.currentTimeMillis());
	}

	public static void multiThreaded(ArrayList<String> path) {
		System.out.println(" time is :" + System.currentTimeMillis());

		for (int index = 0; index < path.size(); index++) {

			LineCounter counter = new LineCounter(path.get(index));
			counter.start();
		}
		System.out.println(" time is :" + System.currentTimeMillis());
	}

}
