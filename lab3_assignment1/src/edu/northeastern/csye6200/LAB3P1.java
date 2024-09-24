package edu.northeastern.csye6200;

import java.util.Scanner;


public class LAB3P1 {
	public static void main(String[] args) {
		// TODO: write your code here
		System.out.print("Enter a credit card number as a long integer:");
		long number;
		Scanner input = new Scanner(System.in);
		number = input.nextLong();
		
		
		
		
		
		
	}

	/** Return true if the card number is valid */
	public static boolean isValid(long number) {
		// TODO: write your code here
		return true;
	}

	/** Get the result from Step 2 */
	public static int sumOfDoubleEvenPlace(long number) {
		// TODO: write your code here
		int[] card_reverse = reverseArray(number);
		l = card_reverse.length;
		int sum = 0;
		for(int i = 1; i < l; i = i + 2) {
			sum = sum + getDigit(card_reverse[i]);
			System.out.printf("%d, %d\n", 2*card_rev[i], sum);
		}
		return sum;
		
		
		return 0;
	}

	/**
	 * Return this number if it is a single digit, otherwise, return the sum of
	 * the two digits
	 */
	public static int getDigit(int number) {
		// TODO: write your code here
		if (2*number < 10)
			return 2*number
		else {
			int flag = 2*number;
			int[] x = new int[2];
			x[0] = flag/10;
			x[1] = flag%10;
			return (x[0]+x[1]);
		}
		
	}

	/** Return sum of odd place digits in number */
	public static int sumOfOddPlace(long number) {
		// TODO: write your code here
		int[] card_reverse = reverseArray(number);
		l = card_reverse.length;
		int sum = 0;
		for(int i = 1; i < l; i = i + 2) {
			sum = sum + card_rev[i];
			System.out.printf("%d, %d\n", card_rev[i], sum);
		}
		return 0;
	}

	/** Return true if the digit d is a prefix for number */
	public static boolean prefixMatched(long number, int d) {
		// TODO: write your code here
		return true;
	}

	/** Return the number of digits in d */
	public static int getSize(long d) {
		// TODO: write your code here
		return 0;
	}

	/**
	 * Return the first k number of digits from number. If the number of digits
	 * in number is less than k, return number.
	 */
	public static long getPrefix(long number, int k) {
		// TODO: write your code here
		return 0;
		
	}
	
	
	
	//the following two methods are my methods to help me accomplish the program
	public static int[] longToDigits(long number) {
	    
		int length = (int) Math.log10(number) + 1; // calculate the length of the number
	    
	    int[] digits = new int[length];// create a new array
	    
	    for (int i = length - 1; i >= 0; i--) {
	        digits[i] = (int) (number % 10);  // stay the last number each time
	        number = number / 10;    // kick out the last number then   
	    }
	    return digits;
	}
	public static int[] reverseArray(long number) {
		int[] array = longToDigits(number);
		int[] arr_rev = new int[rray.length];
		for (int i = 0; i < array.length; i++)
			arr_rev[i] = array[array.length - 1 - i];
		return arr_rev;
	}
}
