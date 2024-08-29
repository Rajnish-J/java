package sabari;
// ! Capitalizing each word in the sentence

import java.util.Scanner;

public class Assignment_4 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String input = sc.nextLine();
		String arr[] = input.split(" ");
		String str1 = "";
		for (int i = 0; i < arr.length; i++) {
			str1 += Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1, arr[i].length()) + " ";
		}
		System.out.println(str1);
	}
}