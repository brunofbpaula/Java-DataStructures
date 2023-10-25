package com.blackout.main;

import java.util.*;
import static java.util.Arrays.*;


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
		// for (int counter = numbers[0]; counter < numbers[1]; counter ++) {
			// System.out.println(counter);
		// }

		// Array class
		// Printing with stream
		stream(colors).forEach(System.out::println);

		// Dealing with 2D Arrays
		char[][] board = new char[3][3];

		// Filling it
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){

				// Filling the first column with X's
				if(j == 0){
					board[i][j] = 'X';
				}

				// Filing the rest with dashes
				else{
					board[i][j] = '-';
				}

			}
		}

		// Printing it out
		System.out.println(deepToString(board));

		// Setting default values
		char[][] boardTwo = new char[][]{
				new char[]{'B', 'B', 'B'},
				new char[]{'L', 'L', 'L'},
				new char[]{'K', 'K', 'K'}
		};

		System.out.println(deepToString(boardTwo));

		/*
		USEFUL METHODS
		They are all static, meaning it's not needed an array object to invoke them,
		We can simply use Arrays. and then the name of the method in which we pass the array
		 */

		// Array as a List
		String [] jujutsu = {"Satoru Gojo", "Suguru Geto", "Toji Zeni'n"};

		// Doing this gives us a larger variety of methods
		List<String> characters = new ArrayList<>(Arrays.asList(jujutsu));
		characters.add(3, "Ryomen Sukuna");

		for (String c : characters) {
			System.out.println(c + " ");
		}

		// Filling array with 100's
		int[] equal_numbers = new int[5];
		Arrays.fill(equal_numbers, 100);
		System.out.println(Arrays.toString(equal_numbers));

		// Copying an existing array
		String[] friends = {"Lipe", "Miguel", "Mayra"};
		String[] newfriends = Arrays.copyOf(friends, friends.length);
		newfriends[newfriends.length -1] = "Bárbara";
		System.out.println("Old friends: " + Arrays.toString(friends) + "\nNew friends: " + Arrays.toString(newfriends));

		// Equals method
		String[] collegeFriends = {"Kayque", "Gabriel"};
		String[] collegeFriends2 = {"Kayque", "Gabriel"};

		System.out.println("This returns a boolean response to whether " +
				"these two arrays are pointing to the exact same set of data or not: " + (collegeFriends == collegeFriends2));

		System.out.println("This returns a response to whether the content of both arrays are equal or not: "
				+ Arrays.equals(collegeFriends, collegeFriends2));

		// Compare
		// It's similar to the Equals method, if the two arrays have the same number of elements
		// And all the elements are equal, it returns a zero. Otherwise, if the first arrays is lexicographically first,
		// It returns a negative number and if array twos is lexicographically first, then a positive number will be returned.
		// The returned number is actually the distance from one letter to another, if they are in the same position but are different.
		int result = Arrays.compare(collegeFriends, collegeFriends2);
		System.out.println(result);

		// Sort method - It's applied in place and it possesses a parameter called 'comparators' that's useful
		int[] primeNumbers = {19, 11, 17, 13, 2, 3, 5};
		Arrays.sort(primeNumbers);
		System.out.println(Arrays.toString(primeNumbers));

		// Binary Search
		// It takes in a sorted array and an element, and it returns the element's index.
		// If not found, it returns a negative number.
		// If there are many occurrences, it's not guaranteed which one is going to get returned.
		System.out.println("Index of the element with value 11 is: " + Arrays.binarySearch(primeNumbers, 11));
	}

}
