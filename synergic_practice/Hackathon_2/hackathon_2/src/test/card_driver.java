package test;

import java.util.*;

public class card_driver {

	public static void main(String[] args) {

		ArrayList<card> card_details = new ArrayList<card>();
		card_details.addAll(Arrays.asList(new card("36345621", 20000, 1000, 'Y'),
				new card("37347621", 40000, 10000, 'Y'), new card("37347898", 20000, 1000, 'Y'),
				new card("37347191", 2000, 10000, 'Y'), new card("37347191", 20000, 1000, 'N')));

		ArrayList<String> res = validator(card_details);
		System.out.println(res);

//		boolean print = rule_2(new card("37347191", 20000, 1000, 'N'));
//		System.out.println(print);
	}

	public static ArrayList<String> validator(ArrayList<card> card) {

//		=> this arraylist stores output
		ArrayList<String> res = new ArrayList<String>();

//		=> for valid objects
		ArrayList<card> res_1 = new ArrayList<card>();

		for (int i = 0; i < card.size(); i++) {
			card c = card.get(i);
			if ((rule_1(c)) && (rule_2(c))) {
				res_1.add(c);
				res.add("valid records");
			} else {
				res.add("invalid records");
			}
		}

		System.out.println(res_1);

		return res;

	}

	public static boolean rule_1(card c) {
		boolean res = true;

//		=> storing card_number:
		String card_num = c.getCard_Number();
//		=> integer variable to add the remaining digits
		int sum = 0;
//		=> boolean variable to check the sum is lesser that 36 or 37
		boolean check = true;

//		=> fetching first two number
		String firsttwo_str = card_num.substring(0, 2);

//		=> checking next 6 digits.
		for (int i = 2; i < card_num.length(); i++) {
			char ch = card_num.charAt(i);
			sum += ch - '0';
		}

		check = (((sum < 36) && (sum > 0)) ? true : false);

		if ((card_num.length() == 8) && ((firsttwo_str.equals("36")) || (firsttwo_str.equals("37"))) && (check)) {
			res = true;
		} else {
			res = false;
		}
		return res;
	}

	public static boolean rule_2(card c) {
//		=> return boolean variable
		boolean res = false;

		char debit = c.getDebit_indicator();

		if (debit == 'N') {
			res = true;
		} else if (debit == 'Y') {
			if (c.getCredit_balance() > c.getAmount()) {
				res = true;
			}
		}

		return res;
	}

}