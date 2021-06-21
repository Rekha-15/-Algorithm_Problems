/************************************************************************************
 * @purpose Implementing Binary Search Program
 * @author rekha
 * version 1.0
 * since 14-06-2021
 ************************************************************************************/

package com;

/**
 * BinarySearch is an class of public type
 * @author rekha
 *
 */

public class BinarySearch {
	
	/**
	 * BinarySearch is an method of public static type
	 * initializing left as 0, and right has arr.length -1
	 * mentioning formula m(middle value) to find middle element.
	 * Then, comparing i/p (as x) element to middle value, will get result
	 * @param arr arr initialize has string, to store the list of words
	 * @param x initialized has string, it assigned to search element
	 * @return integer value
	 * 
	 */
	
	public static int binarySearch(String[] arr, String x) {
		int left = 0, right = arr.length - 1;
		while (left <= right) {
			int midlleValue = left + (right - left) / 2;

			int result = x.compareTo(arr[midlleValue]);

			// Check if x is present at mid
			if (result == 0)
				return midlleValue;

			// If x greater, ignore left half
			if (result > 0)
				left = midlleValue + 1;

			// If x is smaller, ignore right half
			else
				right = midlleValue - 1;
		}

		return -1;
	}
	
	/**
	 * Driver method to test above
	 * initializing arr and x as string
	 * in arr - storing list of words
	 * in x - mentioning the searching element
	 * @param args - argument, its an actual value that are passed to variables
	 */
	public static void main(String[] args) {
		String[] arr = { "contribute", "geeks", "ide", "practice" };
		String x = "ide";
		int result = binarySearch(arr, x);//by using binary search, in an arr it will search for x word

		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at " + "index " + result);
	}
}
