/**
 * Purpose Implementing Bubble Sorting Program using Generic
 * @author rekha
 * @version 1.0
 * @since 15-06-2021
 */

package com;

/**
* BubbleSortGeneric is a class of public type it extending comparable method
* 
* @author rekha
*
* @param <T> is using to implement generic
*/

public class BubbleSortGeneric<T extends Comparable<? super T>> {
	
	/**
	 * main method
	 * 
	 * @param args - argument, its an actual value that are passed to variables
	 *initializing arrayOfString has string taking string values
	 * storing arrayOfString elements in bubbleSort i.e string sorter
	 */
	
    public static void main(String[] args)
    {
        
        String[] arrayOfStrings = {"King", "Panda", "Soldiers", "Dancing", "Flowering","Cat", "Mum-Mum", "Joyfull", "In-out","Marvel", "Kitty", "Miracle", "Money", "Rekha", "Zoom-zoom", "Crying", "Bubbles", "Amazing", "Rose","Magnet" };
        BubbleSortGeneric<String> stringSorter = new BubbleSortGeneric<>();// bubble sorting
        stringSorter.bubbleSort(arrayOfStrings);
        System.out.println(java.util.Arrays.toString(arrayOfStrings));
    }

        /**
         * bubbleSort is method of public type 
         * bubbleSort method used to sort the string elements using bubble sorting
         * swapping if the item at the previous index is greater than the item at the `currentIndex`
         * and saving the index that was modified
         * also saving the last modified index so we know not to iterate past it since all proceeding values are sorted
         * @param array using for string elements
         */
    
        public void bubbleSort(T[] array)
        {
            int n = array.length;
            while (n > 0)
            {
                int lastModifiedIndex = 0;
                for (int currentIndex = 1; currentIndex < n; currentIndex++)
                {
                    // if the item at the previous index is greater than the item at the `currentIndex`, swap them
                    if (array[currentIndex - 1].compareTo(array[currentIndex]) > 0)
                    {
                        // swap
                        T temp = array[currentIndex - 1];
                        array[currentIndex - 1] = array[currentIndex];
                        array[currentIndex] = temp;
                        // save the index that was modified
                        lastModifiedIndex = currentIndex;
                    }
                }
                // save the last modified index so we know not to iterate past it since all proceeding values are sorted
                n = lastModifiedIndex;
            }
        }
    }
