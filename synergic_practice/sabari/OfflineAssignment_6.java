package sabari;
// ! printing the words that having vowels on their first character in the given sentence

import java.util.Scanner;

public class OfflineAssignment_6 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String str = sc.nextLine();
		String arr[] = str.split(" ");
		for (String word : arr) {
			char ch = word.charAt(0);
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.print(word + " ");
			}
		}
	}
}