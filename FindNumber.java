/**
 * @purpose Finding A Number
 * @author rekha
 * @version 1.0
 * @since 15-06-2021
 */

package com;

import java.util.Scanner;

/**
 * FindNumber is a class of public type
 * main method
 * @author rekha
 *
 */

public class FindNumber {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Number Guessing game");
		int startRange = 1;
		int endRange = 100;
		System.out.println("Guess a number in range(1 to " + endRange + ")");
		boolean out = guessNumber(startRange, endRange);
		if (out) {
			sc.close();
			System.exit(0);
		}
	}

	/**
	 * this method guesses the number using binary search
	 * 
	 * @param startRange the start range 1
	 * @param endRange   the end range 100
	 * @return
	 */
	private static boolean guessNumber(int startRange, int endRange) {
		int mid = (startRange + endRange) / 2;
		System.out.println("Is the number is " + mid + "?");
		String user = sc.nextLine();
		if (user.equalsIgnoreCase("Y")) {
			System.out.println("WOW ! Successfully Guessed Number");
			return true;
		} else if (user.equalsIgnoreCase("N")) {
			System.out.println("Actual number is greater than" + mid + "?");
			user = sc.nextLine();
			System.out.println(user);
			if (user.equalsIgnoreCase("Y")) {
				return guessNumber(mid + 1, endRange);
			} else if (user.equalsIgnoreCase("N")) {
				return guessNumber(startRange, mid - 1);
			}
		} else {
			System.out.println("Invalid Input. Print 'Y'/'N'");
			return guessNumber(startRange, endRange);
		}
		return false;
	}
}