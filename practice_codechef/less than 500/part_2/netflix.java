// Alice, Bob, and Charlie are contributing to buy a Netflix subscription. However, Netfix allows only two users to share a subscription.
// Given that Alice, Bob, and Charlie have A,B, and C rupees respectively and a Netflix subscription costs X rupees, 
// find whether any two of them can contribute to buy a subscription.

import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int alice_contribution = sc.nextInt();
		    int bob_contribution = sc.nextInt();
		    int charlie_contribution = sc.nextInt();
		    int prize = sc.nextInt();
		    
		    System.out.println((alice_contribution + bob_contribution) >= prize || (alice_contribution + charlie_contribution) >= prize || (bob_contribution + charlie_contribution) >=prize? "YES" : "NO");
		}

	}
}
