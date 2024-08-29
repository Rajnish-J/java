package level_1;

import java.util.*;

public class unique {
	static Scanner sc = new Scanner(System.in);
	
//	main 
	public static void main(String[] args) {
		System.out.print("Enter the access code: ");
		String ip = sc.next();
		
		if(sp(ip) && equal(ip) && sum(ip)) {
			System.out.println("Access code valid");
		}
		else {
			System.out.println("Access code not valid");
		}
	}
	

	// ---
	public static boolean sp(String str) {
		boolean res;
		int sp_count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '!' || ch == '@' || ch == '#' || ch == '%' || ch == '$') {
				sp_count++;
				if (sp_count >= 1) {
					break;
				}
			}
		}
		if (sp_count >= 1) {
			res = true;
		} else {
			res = false;
		}
		return res;
	}

//	---
	public static boolean equal(String str) {
		boolean res = true;
		boolean equal = true;
		int let = 0, num = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				let++;
			} else if ((ch >= '0' && ch <= '9')) {
				num++;
			}
		}
		if (let != num) {
			res = false;
		}
		return res;
	}
	
//	--
	
	public static boolean sum(String str) {
		boolean res = false;
		int num = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((ch >= '0' && ch <= '9')) {
				num += ch;
			}
		}
		
		if(num / 5 > 0) {
			res = true;
		}
		return res;
	}
}

// A5b#6Cd!
// 11 / 5 = 2
