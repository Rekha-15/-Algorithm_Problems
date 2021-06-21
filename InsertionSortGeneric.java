/**
 * Purpose Implementing Insertion Sorting Program using Generic
 * @author rekha
 * @version 1.0
 * @since 15-06-2021
 */

package com;

/**
 * InsertionSortGeneric is a class of public type it extending comparable method
 * 
 * @author rekha
 *
 * @param <T> is using to implement generic
 */

public class InsertionSortGeneric<T extends Comparable<? super T>> {

	/**
	 * main method
	 * 
	 * @param args - argument, its an actual value that are passed to variables
	 *initializing arrayOfString has string taking string values
	 * storing arrayOfString elements in insertionSorting
	 */

	public static void main(String[] args) {

		String[] arrayOfStrings = { "Andree", "Leana", "Faviola", "Loyce", "Quincy", "Milo", "Jamila", "Toccara",
				"Nelda", "Blair", "Ernestine", "Chara", "Kareen", "Monty", "Rene", "Cami", "Winifred", "Tara",
				"Demetrice", "Azucena" };
		InsertionSortGeneric<String> stringSorter = new InsertionSortGeneric<>();
		stringSorter.insertionSort(arrayOfStrings);
		System.out.println(java.util.Arrays.toString(arrayOfStrings));
	}

	/**
	 * insertionSort is method of public type 
	 * isertionSorting method is used to sortthe array
	 * 
	 * @param array array of string Checking that currentIndex is at least 1 and
	 * also checking for that the item directly before the currentIndex
	 *is greater than the item at currentIndex If both conditions are
	 * matched, then swapping the indexes
	 */

	public void insertionSort(T[] array) {

		for (int i = 1; i < array.length; i++) {

			int currentIndex = i;

			while (currentIndex > 0 && array[currentIndex - 1].compareTo(array[currentIndex]) > 0) {

				T temp = array[currentIndex];
				array[currentIndex] = array[currentIndex - 1];
				array[currentIndex - 1] = temp;
				currentIndex--;
			}
		}
	}
}
