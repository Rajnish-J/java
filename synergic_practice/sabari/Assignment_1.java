package sabari;
// ! String to char array printing in different line

import java.util.Scanner;

public class Assignment_1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String word = sc.next();
		char arr[] = word.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
