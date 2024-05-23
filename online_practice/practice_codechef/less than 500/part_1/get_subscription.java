// Chef wants to conduct a lecture for which he needs to set up an online meeting of exactly X minutes.
// The meeting platform supports a meeting of maximum 30 minutes without subscription and a meeting of unlimited duration with subscription.
// Determine whether Chef needs to take a subscription or not for setting up the meet.

import java.util.*;

class Get_subscription
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int time_taken = sc.nextInt();
		    
		    System.out.println((time_taken <= 30) ? "NO" : "YES");
		}

	}
}
