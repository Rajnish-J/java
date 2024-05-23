// In a coding contest, there are prizes for the top rankers. The prize scheme is as follows:
// Top 10 participants receive rupees X each. Participants with rank 11 to 100 (both inclusive) receive rupees Y each.
// Find the total prize money over all the contestants.

import java.util.*;
class prize_money {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t -- > 0){
		    int first_prize = sc.nextInt();
		    int second_prize = sc.nextInt();
		    int res = (first_prize * 10) + (second_prize * 90);
		    System.out.println(res);
		}
    }
}
