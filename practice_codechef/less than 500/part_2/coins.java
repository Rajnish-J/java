// There are only 2 type of denominations in Chefland:
// * Coins worth 1 rupee each
// * Notes worth 10 rupees each
// Chef wants to pay his friend exactly X rupees. What is the minimum number of coins Chef needs to pay exactly X rupees?

import java.util.*;

class coinz
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    
		    int money = sc.nextInt();
		    int coins = money % 10;
		    
		    System.out.println(coins);
		}

	}
}
