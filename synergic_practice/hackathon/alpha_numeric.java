package hackathon;

import java.util.*;

public class alpha_numeric {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// System.out.print("Enter the alpha numeric input: ");
		String ip = "a1b2c3d1";

		int check = 0;
		for (int i = 0; i < ip.length(); i++) {
			char ch = ip.charAt(i);
			if ((ch >= '0' && ch <= '9')) {
				check += ch;
			}
		}
		boolean res = check == 7;
		System.out.println((res) ? "true" : "false");

	}
}
// a1b2c3d1