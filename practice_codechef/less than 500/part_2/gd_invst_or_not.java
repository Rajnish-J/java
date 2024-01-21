// Chef has invested his money at an interest rate of X percent per annum while the current inflation rate is Y percent per annum.
// An investment is called good if and only if the interest rate of the investment is at least twice of the inflation rate.
// Determine whether the investment made by Chef is good or not.

import java.util.*;

class good
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int rate = sc.nextInt();
		    int time = sc.nextInt();
		    
		    System.out.println(((time * 2) <= rate) ? "YES" : "NO");
		}

	}
}
