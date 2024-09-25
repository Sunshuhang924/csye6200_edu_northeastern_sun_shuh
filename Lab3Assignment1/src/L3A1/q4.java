package L3A1;

import java.util.Scanner;

public class q4 {

    public static void main(String[] args) {
        
    	Scanner input = new Scanner(System.in);
        System.out.print("Enter strings: ");
        String userInput = input.nextLine();
       
        String[] strings = userInput.split(",\\s*"); 

        System.out.print("We have: ");
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i]);
            if (i < strings.length - 1) {
                System.out.print(", ");
            }
        }

        String longestString = findLongestString(strings);
        System.out.println("\nThe longest string was: " + longestString);
    }
    
    public static String findLongestString(String[] strings) {
        String longest = "";
        for (String s : strings) {
            if (s.length() >= longest.length()) {
                longest = s;
            }
        }
        return longest;
    }

}
