/**
 * Purpose: to find the prime numbers that are Anagram and Palindrome 
 * @author Rekha
 * @version 1.0
 * @since 15/06/2021
 */

package com;

import java.util.Arrays;

/** 
 * PrimeNo_AnnagramPalindrome is class of public type
 * in this class we are trying to fina pirme numbers between 1 to 1000 which is also a anagram and palindrome
 * @author rekha
 *
 */

public class PrimeNo_AnnagramPalindrome {

	/**
	 * isAnagram is method of public boolean type
	 * isAnagram methos using to check weather the number is anagram or not
	 * first converting string to array
	 * if 1st string or 1st number and 2nd string or number length is differnt it return false directly
	 * else it return false
	 * @param arr1 first number
	 * @param arr2 second number
	 * @return true or false 
	 */
	
	public boolean isAnagram(String str1, String str2) {
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		if (str1.length() != str2.length()) {
			return false;
		} else {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if (Arrays.equals(arr1, arr2)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * isPrime method is public static type
	 * isPrime method using to find out weather number is prime or not
	 * if number is 0 or 1 it @returns false
	 * @param num is a number between 0 to 1000
	 * @return true or false
	 */
	
	public static boolean isPrime(int num) {
		if (num == 0 || num == 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}

	/**
	 * isPalindrome is a method of public boolean type
	 * isPalindrome method used to finf weather numbers are palindrome or not
	 * taking variable r and sum 
	 * storing number in temp
	 * @param num
	 * @return true or false
	 */
	
	public boolean isPalindrome(int num) {
		int r, sum = 0;
		int temp = num;
		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		if (temp == sum) {
			return true;
		} else {
			return false;
		}
	}
	

	/**
	 * main method
	 * PrimeNo_AnnagramPalindrome is a class crating a number object in PrimeNo_AnnagramPalindrome class
	 * it will check prime numbers between interval 1 to 1000 , if prime number is both anaram and palindrome
	 * printing that number
	 * @param args - argument, its an actual value that are passed to variables
	 */
	
	public static void main(String[] args) {
		
		PrimeNo_AnnagramPalindrome number = new PrimeNo_AnnagramPalindrome();
		
		for (int i = 0; i <= 1000; i++) {
			
			if (PrimeNo_AnnagramPalindrome.isPrime(i)) {
				
				for (int j = i; j < 1000; j++) {
					
					if (i != j) {
						
						if (PrimeNo_AnnagramPalindrome.isPrime(j)) {
							
							if (number.isAnagram(String.valueOf(i), String.valueOf(j)) && number.isPalindrome(i)) {
								
								System.out.println(i + " " + j + " is a prime and anagram and palindrome number");
							}
						}
					}
				}

			}

		}

	}

}
