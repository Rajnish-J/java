// Chef has finally decided to complete all of his pending assignments.

// There are X assignments where each assignment takes Y minutes to complete.
// Find whether Chef would be able to complete all the assignments in Z days.\

import java.util.*;

class assignment
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-->0){
	        int assi = sc.nextInt();
	        int time = sc.nextInt();
	        int days = sc.nextInt();
	        
	        int time_taken = assi * time;
	        int min_per_day = 24*60;
	        
	        System.out.println(((min_per_day * days) >= time_taken) ? "YES" : "NO");
	    }

	}
}
