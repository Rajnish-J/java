package sabari;
// ! printing the odd size words in the given sentences

import java.util.Scanner;

public class OfflineAssignment_5 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String str = sc.nextLine();
		String arr[] = str.split(" ");
		for (String s : arr) {
			if (s.length() % 2 != 0) {
				System.out.print(s + " ");
			}
		}
	}
}