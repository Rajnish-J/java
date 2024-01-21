// chef categorises an instagram account as spam, if, the following count of the account is more than 10 times the count of followers.
// Given the following and follower count of an account as X and Y respectively, find whether it is a spam account.

import java.util.*;

class instagram
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int count = sc.nextInt();
		    int followers_count = sc.nextInt();
		    
		    System.out.println((count > 10 * followers_count) ? "YES" : "NO");
		}

	}
}
