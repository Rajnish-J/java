// Alice, Bob and Charlie are bidding for an artifact at an auction.
// Alice bids A rupees, Bob bids B rupees, and Charlie bids C rupees (where A, B, and C are distinct).

// According to the rules of the auction, the person who bids the highest amount will win the auction.
// Determine who will win the auction.

import java.util.*;

class bidding
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner (System.in);
	    int t = sc.nextInt();
	    while(t-->0){
	        
	        int alice = sc.nextInt();
	        int bob = sc.nextInt();
	        int charlie = sc.nextInt();
	        
	        if((alice>bob) && (alice>charlie)){
	            System.out.println("Alice");
	        }
	        else if((bob>alice) && (bob>charlie)){
	            System.out.println("Bob");
	        }
	        else{
	            System.out.println("Charlie");
	        }
	    }

	}
}
