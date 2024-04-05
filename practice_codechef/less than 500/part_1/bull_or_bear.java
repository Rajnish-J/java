// Chef is on his way to become the new big bull of the stock market but is a bit weak at calculating whether,
//he made a profit or a loss on his deal.

//Given that Chef bought the stock at value X and sold it at value Y. 
// Help him calculate whether he made a profit, loss, or was it a neutral deal.

import java.util.*;

class bull_or_bear
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int bought = sc.nextInt();
		    int sold = sc.nextInt();
		    
		    if(bought<sold){
		        System.out.println("PROFIT");
		    }
		    if(bought>sold){
		        System.out.println("LOSS");
		    }
		    if(bought == sold){
		        System.out.println("NEUTRAL");
		    }
		}

	}
}
