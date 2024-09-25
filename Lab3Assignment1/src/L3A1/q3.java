package L3A1;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of values: ");
		int num = input.nextInt();
		int[] values = new int[num];
		System.out.print("Enter the number: ");
		for(int i = 0; i < num; i++) {
			values[i] = input.nextInt();
		}
		if(isConsecutiveFour(values) == true) {
			System.out.print("The list has consecutive fours ");
		}
		else System.out.print("The list has no consecutive fours ");
	}
	
	public static boolean isConsecutiveFour(int[] values) {
		// TODO: write your code here
		int flag = 0;
		for (int i = 0; i < values.length - 3; i++) {
			if (values[i] == values[i+1] && values[i] == values[i+2] &&values[i] == values[i+3]) {
				flag = 1;
			}
			else continue;			
		}
		if (flag == 1)
			return true;
		else return false;
	}
}
