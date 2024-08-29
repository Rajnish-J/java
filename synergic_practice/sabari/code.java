// ! code validation

import java.util.*;

public class code {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the String :");
		String str = sc.next();
		System.out.println(check(str) ? "Access code Vaild" : "Access code InVaild");
	}// main

	private static boolean check(String str) {
		String let = "";
		String digit = "";
		int sp = 0;
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLetter(ch)) {
				let += ch;
			} else if (Character.isDigit(ch)) {
				digit += ch;
				sum += Integer.parseInt(ch + "");
			} else if (ch == '!' || ch == '@' || ch == '#' || ch == '$' || ch == '%') {
				sp++;
			}
		} // for
		System.out.println(digit);
		System.out.println(let);
		if (sp > 1 && (let.length() == digit.length()) && sum % 5 == 0) {
			return true;
		} // if

		return false;
	}
}
