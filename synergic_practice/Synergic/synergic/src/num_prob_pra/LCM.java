package num_prob_pra;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num_1 = sc.nextInt();
		int num_2 = sc.nextInt();
		int small = Math.min(num_1, num_2);
		int gcd = 1;
		int lcm = 1;

		for (int i = small; i >= 1; i--) {
			if ((num_1 % i == 0) && (num_2 % i == 0)) {
				gcd = i;
				break;
			}
		}
		
		lcm = (num_1 * num_2) / gcd;
		System.out.println("GCD: " + gcd);
		System.out.println("LCM: " + lcm);
	}
}
