package com;

/**
 * @author rekha
 *
 */
class PrimeNumbers
{

 /**
 * Declaring the variables
 * Initializing i and num as int
 * @param args - argument, its an actual value that are passed to variables
 * Traverse each number in the interval 
 * with the help of for loop
 * initializing counter as 0 first
 * if num 0 means i is not prime
 * if num is 1 means i is prime
 */
public static void main (String[] args)
   {		
       int i =0, num =0;
       //Empty String
       
       String  primeNumbers = "";

       for (i = 0; i <= 1000; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     //Appended the Prime number to the String
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }	
       System.out.println("Prime numbers from 1 to 1000 are :");
       System.out.println(primeNumbers);
   }
}
