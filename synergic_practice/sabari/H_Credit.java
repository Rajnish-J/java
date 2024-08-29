package sabari;
// ! collections CRUD

import java.util.*;

public class H_Credit {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		long num = sc.nextLong();
		String str = num + "";

		if (str.startsWith("4") && (str.length() == 13 || str.length() == 16)) {
			int odd = 0;
			for (int i = 0; i < str.length(); i++) {
				if ((i % 2) != 0) {
					odd += Integer.parseInt(str.charAt(i) + "");
				}
			} // visa for
			if (odd % 2 != 0) {
				System.out.println("Visa Card Identification");
			}
		} // visa if

		// MasterCard
		if (str.length() == 16) {
			long check = (num) / (100000000000000l);
			System.out.println(check);// 5500123456789021
			if (check >= 51 && check <= 55 && sum(str)) {
				System.out.println("Master Card Identification");
			}
		}

		// American Express
		if (str.length() == 15) {
			long check = (num) / (10000000000000l);
			if (check >= 34 && check <= 37 && sum(str)) {
				System.out.println("Amex Identification");
			}
		}

	}// main

	private static boolean sum(String str) {
		// TODO Auto-generated method stub

		int even = 0;
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 0) {
				even += Integer.parseInt(str.charAt(i) + "");
			}
		}
		return (even % 2) == 0;
	}
}
