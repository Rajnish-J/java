// Chef is eagerly waiting for a piece of information. His secret agent told him that this information would be revealed to him after K weeks.
// X days have already passed and Chef is getting restless now. Find the number of remaining days Chef has to wait for, to get the information.
// It is guaranteed that the information has not been revealed to the Chef yet.

import java.util.*;

class rema_days
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int weeks = sc.nextInt();
		    int rem_days = sc.nextInt();
		    
		    System.out.println((weeks*7) - rem_days);
		}

	}
}
