package L3A1;

import java.util.Arrays;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[5]; // Array for user input
        
        System.out.println("Input array: ");
        for (int i = 0; i < 5; i++) {
            nums[i] = input.nextInt(); // Read integers into the array
        }
        
        // Create references for manipulation
        int[] nums1 = nums; //this is not to create a new array, but point nums to a new num1
        int[] nums2 = Arrays.copyOf(nums, nums.length); 
        // so we can just copy nums to nums2, or we rotate the reversed one
        int[] nums3 = nums; 
        int[] nums4 = nums; 
        
        reverseArray(nums1); // Reverse the user input array
        rotateArray(nums2, 2); // Rotate the predefined array by 2
        sortedArray(nums3); // Sort the user input array
        largestElement(nums4); // Find the largest element
    }

    /** Reverse the array */
    public static void reverseArray(int[] nums) {
        int length = nums.length; 
        for (int i = 0; i < length / 2; i++) { 
            // Swap elements
            int temp = nums[i];
            nums[i] = nums[length - i - 1];
            nums[length - i - 1] = temp;
        }
        // Print reversed array
        System.out.println("\nReversed array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    /** Rotate the array to the right */
    public static void rotateArray(int[] nums, int places) {
        int length = nums.length; 
        places = places % length; // Adjust places if larger than length
        
        int[] rotated = new int[length]; 
        // Shift elements
        for (int i = 0; i < length; i++) {
            rotated[(i + places) % length] = nums[i];
        }
        // Print rotated array
        System.out.println("\nRotated array:");
        for (int num : rotated) {
            System.out.print(num + " ");
        }
    }

    /** Sort the array in ascending order */
    public static void sortedArray(int[] nums) {
        // Simple bubble sort
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) { // Swap if necessary
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        // Print sorted array
        System.out.println("\nSorted array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    /** Find and print the largest element */
    public static void largestElement(int[] nums) {
        int largest = nums[0]; 
        for (int i = 1; i < nums.length; i++) {
            if (largest < nums[i]) {
                largest = nums[i]; // Update largest
            }
        }
        // Print largest element
        System.out.println("\nThe biggest element is " + largest);
    }
}
