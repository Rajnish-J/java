package num_prob_pra;

import java.util.Scanner;

public class Str_palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		boolean check = false;

		int i = 0;
		int j = str.length() - 1;

		while (i++ < j--) {
			if (str.charAt(i) != str.charAt(j)) {
				check = false;
				break;
			} else {
				check = true;
			}

		}
		System.out.println(check ? "palindrome" : "not a palindrome");
	}
}
