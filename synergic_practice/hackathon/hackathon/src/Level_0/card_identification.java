package Level_0;

import java.util.*;

public class card_identification {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the card number: ");
		String card = sc.next();
		
		System.out.println(check_card(card));
		
		
	}
	
	public static String check_card(String str) {
		String res = "";
		boolean check_visa;
		int temp_visa = 0;
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(i % 2 != 0) {
				temp_visa = temp_visa +  ch;
			}
		}
		if(temp_visa % 2 == 0) {
			check_visa = false;
		}
		else {
			check_visa = true;
		}
		
//		Visa card validation
		if(str.startsWith("4") && ((str.length() == 13) || (str.length() == 16)) && (check_visa)) {
			res = "Visa card";
		}
		
//		mastcard validation
		boolean check_master;
		int temp_master = 0;
		int first_two_master = Integer.parseInt(str.substring(0, 2));
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(i % 2 == 0) {
				temp_master += ch;
			}
		}
		if(temp_master % 2 == 0) {
			check_master = true;
		}
		else {
			check_master = false;
		}
		if(((first_two_master == 51) || (first_two_master == 55)) && (str.length() == 16) && (check_master)) {
			res = "master card";
		}
		
//		american
		boolean check_amer;
		int first_two_amer = Integer.parseInt(str.substring(0, 2));
		int temp_ame = 0;
		if(temp_ame % 2 == 0) {
			check_amer = true;
		}
		else {
			check_amer = false;
		}
		if(((first_two_amer == 34) || (first_two_amer == 37)) || (str.length() == 15) && (check_amer)) {
			res = "american card";
		}
		
		
		return res;
	}
}
