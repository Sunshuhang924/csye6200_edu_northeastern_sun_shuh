package L3A1;

import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {
        System.out.print("Enter a credit card number as a long integer:");
        long number;
        Scanner input = new Scanner(System.in);
        number = input.nextLong();
        
        // Example credit card numbers
        // 4388576018402626
        // 5117275325077359
        if (isValid(number)) 
            System.out.printf(number + " is valid");
        else 
            System.out.printf(number + " is invalid");
    }

    /** Check if the card number is valid */
    public static boolean isValid(long number) {
        int stepTwo = sumOfDoubleEvenPlace(number);
        int stepThree = sumOfOddPlace(number);
        int sum_2_3 = stepTwo + stepThree;
        int size = getSize(number);
        
        if (size >= 13 && size <= 16) {
            // Check if the sum is divisible by 10
            if (sum_2_3 % 10 == 0) {
                // Check if the card starts with 4, 5, 6 or 37
                if (prefixMatched(number, 1) || prefixMatched(number, 2)) {
                    return true; // All conditions met, return true
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /** Calculate the sum of double even place digits */
    public static int sumOfDoubleEvenPlace(long number) {
        String cardNumber = new StringBuilder(String.valueOf(number)).reverse().toString(); // Reverse the card number
        int sum = 0;
        for (int i = 1; i < cardNumber.length(); i += 2) { // Start from the second digit to get each even place
            int digit = Character.getNumericValue(cardNumber.charAt(i)); // Get the current digit
            sum = sum + getDigit(digit * 2); // Double the digit and add its value
        }
        return sum;
    }

    /** Return the digit or the sum of the two digits if > 9 */
    public static int getDigit(int number) {
        if (number < 10) {
            return number;
        } else {
            return number / 10 + number % 10; // Return the sum of tens and units
        }
    }

    /** Calculate the sum of odd place digits */
    public static int sumOfOddPlace(long number) {
        String cardNumber = new StringBuilder(String.valueOf(number)).reverse().toString(); // Reverse the card number
        int sum = 0;
        for (int i = 0; i < cardNumber.length(); i += 2) { // Get odd place digits
            int digit = Character.getNumericValue(cardNumber.charAt(i)); // Get the current digit
            sum = sum + digit;
        }
        return sum;
    }

    /** Check if the digit d is a prefix of the number */
    public static boolean prefixMatched(long number, int d) {
        long prefix = getPrefix(number, d);
        if (d == 1) {
            return prefix == 4 || prefix == 5 || prefix == 6; // Check the first digit
        } else if (d == 2) {
            return prefix == 37; // Check the first two digits
        }
        return false;
    }

    /** Return the number of digits in d */
    public static int getSize(long d) {
        return String.valueOf(d).length(); // Count the digits
    }

    /** Return the first k digits from the number */
    public static long getPrefix(long number, int k) {
        int size = getSize(number);
        if (size < k) {
            return number; // If there are less than k digits, return the whole number
        }
        // Convert the number to a string, take the first k digits, and convert back to long
        String numStr = String.valueOf(number);
        return Long.parseLong(numStr.substring(0, k));
    }
}

	
//	Before I learn how to use String.valueOf and StringBuilder, the following are my solutions
//	//the following two methods are my methods to help me accomplish the program 
//	//This method mainly converts integers of type long into their corresponding array types
//	
//	public static int[] longToDigits(long number) {
//	    
//		int length = (int) Math.log10(number) + 1; // calculate the length of the number
//	    
//	    int[] digits = new int[length];// create a new array
//	    
//	    for (int i = length - 1; i >= 0; i--) {
//	        digits[i] = (int) (number % 10);  // stay the last number each time
//	        number = number / 10;    // kick out the last number then   
//	    }
//	    return digits;
//	}
//	//This method is to invert the return array of the longToDigits function for subsequent calculations
//	public static int[] reverseArray(long number) {
//		int[] array = longToDigits(number);
//		int[] arr_rev = new int[array.length];
//		for (int i = 0; i < array.length; i++)
//			arr_rev[i] = array[array.length - 1 - i];
//		return arr_rev;
//	}

