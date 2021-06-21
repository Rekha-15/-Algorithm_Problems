/**
 * Purpose Implementing Merge sorting by taking two sets of string
 * @author rekha
 * @version 1.0
 * @since 15-06-2021
 */

package com;

/**
 * MergeSort is an class of public type
 * Implementing Mergesort program
 * @author rekha
 *
 */

public class MergeSort {

	/**
	 * Taking two string variable 
	 * @param args - argument, its an actual value that are passed to variables
	 * Creating a object called c 
	 */
	
	public static void main(String[] args) {

		String[] a = { "King", "Panda", "Soldiers", "Dancing", "Flowering","Cat", "Mum-Mum", "Joyfull", "In-out" };
		String[] b = { "Marvel", "Kitty", "Miracle", "Money", "Rekha","Zoom-zoom", "Crying", "Bubbles", "Amazing", "Rose",
				"Magnet" };
		String[] c = new String[a.length + b.length];
		mergeSort(a);
		mergeSort(b);
		merge(c, a, b);
		mergeSort(c);
		// Arrays.sort(names);
		for (String arr : c) {
			System.out.println(arr);
		}
	}

	/**
	 * mergeSort is a method of public static type
	 * mergeSort method used used to merge string a an b
	 * @param c
	 * taking words from a and b and merging in c
	 */
	public static void mergeSort(String[] c) {
		if (c.length > 1) {
			String[] a = new String[c.length / 2];
			String[] b = new String[c.length - c.length / 2];
			for (int i = 0; i < a.length; i++) {
				a[i] = c[i];
			}
			for (int j = 0; j < b.length; j++) {
				b[j] = c[j + c.length / 2];
			}
			mergeSort(a);
			mergeSort(b);
			merge(c, a, b);// calling merge method
		}
	}
	
	/**
	 * merge is an method of public static type 
	 * merge method using to merge  a and b elements after sorting
	 * @param name
	 * @param left taken to compare with left side elements
	 * @param right taken to check right side element
	 */
	
	public static void merge(String[] name, String[] left, String[] right) {
		int as = 0;
		int bs = 0;
		for (int i = 0; i < name.length; i++) {
			if (bs >= right.length || (as < left.length && left[as].compareToIgnoreCase(right[bs]) < 0)) {
				name[i] = left[as];
				as++;
			} else {
				name[i] = right[bs];
				bs++;
			}
		}
	}
}