package num_prob_pra;

import java.util.Scanner;

public class Odd_even {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number: ");
		int num = sc.nextInt();

		String[] arr = new String[] { "even", "odd" };
		System.out.println(arr[num & 1]);
	}
}
