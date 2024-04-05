// Chef is ordering food online (instead of cooking) and the bill comes out to be Rs. X. 
// Chef can use one of the following two coupons to avail a discount.

// * Get 10 percent off on the bill amount
// * Get a flat discount of Rs. 100 on the bill amount

// What is the maximum discount Chef can avail?

import java.util.*;

class coupon
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int cost = sc.nextInt();
		    
		    System.out.println((cost/10) >= 100 ? cost/10 : 100);
		}

	}
}
