package com.exercise1_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public class LineCounter extends Thread {
	
	Scanner input ;
	int lnCounter ;
	
	public LineCounter(String path) {
		// TODO Auto-generated constructor stub
		try {
			input = new Scanner(new File(path));
			while (input.hasNextLine()){
				input.nextLine();
				lnCounter ++ ;
			}
			System.out.println(lnCounter);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(" handled file not exist ");
			e.printStackTrace();
		}
		coountTheLine();
	}
	
	public LineCounter (ArrayList<String> str) {
		for (int index = 0 ; index < str.size(); index ++){
			try {
				File f = new File(str.get(index));
				input = new Scanner(f);
				while (input.hasNextLine()){
					input.nextLine();
					lnCounter ++ ;
				}
				System.out.println(f.getName() + "  \thas Lines : ");
				System.out.println(lnCounter);
				lnCounter = 0 ;
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println(" handled file not exist ");
				e.printStackTrace();
			}
			
		}
	}

	private void coountTheLine() {
		// TODO Auto-generated method stub
		while (input.hasNextLine()){
			lnCounter ++ ;
		}
		System.out.println(" this file has "+ lnCounter + " lines ");
		
	}
	public int getlnCounter(){
		return lnCounter;
	}
}