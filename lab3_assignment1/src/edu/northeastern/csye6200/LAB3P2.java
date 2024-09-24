package edu.northeastern.csye6200;

import java.util.Scanner;

public class LAB3P2 {
	public static void main(String[] args) {
		// TODO: write your code here
		Scanner input = new Scanner(System.in);
		int[] array = new int[5];
		System.out.println("Input array: "+flag);
		for (int i = 0; i < 5; i++) {
			array[i] = input.nextInt();
		}
		
	}

	public static void reverseArray(int[] nums) {
		// TODO: write your code here
		int length = array.length;
		int flag = 0;
		for (int i = 0; i < length/2; i++) {
			flag = array[i];
			array[i] = array[length-i-1];
			array[length-i-1] = flag;
		}
		for (int i = 0; i < length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	public static void rotateArray(int[] nums, int places) {
		// TODO: write your code here	
		int length = array.length;
	    n = n % length;  
	    
	    int[] rotated = new int[length];
	    
	    for (int i = 0; i < length - n; i++) {
	        rotated[i] = array[n + i];
	    }
	    for (int i = length - n; i < length; i++) {
	        rotated[i] = array[i - (length - n)];
	    }
	    System.out.println("\n");
	    for (int i = 0; i < length; i++) {
	        System.out.print(rotated[i] + " ");
	    }
	}
	
	public static void sortedArray(int[] nums) {
		// TODO: write your code here
		for(int i = 0; i < array.length; i++) {
			for(int j = i+1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int flag = array[j];
					array[j] = array[i];
					array[i] = flag;
					}
				}
			}
		System.out.println("\n "+flag);
		for (int k = 0; k < array.length; k++) {
	        System.out.print(array[k] + " ");
		}
	}

	public static void largestElement(int[] nums) {
		// TODO: write your code here
		int flag = array[0];
		for (int i = 1; i < array.length; i++) {
			if (flag < array[i])
				flag = array[i];
			else
				flag = flag;
		}
		System.out.println("\nthe biggest element is "+flag);
	}
	
}

