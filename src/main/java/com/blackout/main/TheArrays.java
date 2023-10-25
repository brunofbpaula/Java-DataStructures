package com.blackout.main;

import java.util.Arrays;
import java.util.Iterator;

public class TheArrays {

	public static void main(String[] args) {
		
		
		/* Basically a list of cells
		 * Fixed in size
		 * Fast for data retrieval
		 * Compact memory usage if size is known
		 * Delete operation very hard */
		
		String[] colors = new String[5];
		colors[0] = "Black";
		colors[1] = "Red";
		
		// Printing it out 
		// We need to convert the array to string, if we want to print it entirely
		System.out.println(Arrays.toString(colors));
		
		int[] numbers = {100, 200};
		
		// Printing the numbers between 100 and 200
		for (int counter = numbers[0]; counter < numbers[1]; counter ++) {
			System.out.println(counter);
		}
		
	}

}
