# Introduction

This document details the generation of a java program that writes an uppercase letter to the console. 
This code is managed inside Github.com and uses the Math.random() method asa well as a custom method call.

## Code
```java
/**
 * 
 */

/**
 * @author User
 *
 */
public class Listing_Project_HW_8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 'A' is 65
		int startingValue = 65;
		/* 'Z' is 90,
		 * and we wanted to cover the range, so we added 1 more to ensure
		we would cover A through Z.*/
		 
		int endingValue = 90-startingValue+1;
		
		
		
		/* From page 122 a + Math.random()*b gives us a random
		 * number between a and a+b excluding a+b.*/
		int randomNumber;
		/* We have to make a new variable and then 
		fill it with a random number that is between our starting value
		and ending value. Then print it out. */
		randomNumber = (int)(startingValue + Math.random()*endingValue);
		//System.out.println(randomNumber); // debugging statement.
		
		char letter = (char)randomNumber; 	// recast the number to a letter.
		System.out.println(letter); 		// print it out.


	}

}
```
