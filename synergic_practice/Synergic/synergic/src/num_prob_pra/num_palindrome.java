package num_prob_pra;

import java.util.Scanner;

public class num_palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		// Store the original number to compare later
		int originalNum = num;

		// Variable to store the reversed number
		int reversedNum = 0;

		// Reverse the number
		while (num > 0) {
			int digit = num % 10; 
			reversedNum = reversedNum * 10 + digit;
			num /= 10;
		}

		// Check if the original number and the reversed number are the same
		if (originalNum == reversedNum) {
			System.out.println(originalNum + " is a palindrome.");
		} else {
			System.out.println(originalNum + " is not a palindrome.");
		}
	}
}
