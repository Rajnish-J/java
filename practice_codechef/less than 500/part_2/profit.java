// Chef recently started selling a special fruit.
// He has been selling the fruit for X rupees (X is a multiple of 100). He earns a profit of Y rupees on selling the fruit currently.
// Chef decided to increase the selling price by 10%. Please help him calculate his new profit after the increase in selling price.

// Note that only the selling price has been increased and the buying price is same.

import java.util.*;

class pro
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int selling_price = sc.nextInt();
		    int discount = sc.nextInt();
		    
		    int having = selling_price - discount;
		    
		    int profit = (selling_price * 10) / 100;
		    int extra = selling_price + profit;
		    System.out.println(extra - having);
		   
		}

	}
}
