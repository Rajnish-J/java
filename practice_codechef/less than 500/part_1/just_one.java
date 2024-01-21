// Chef has to attend an exam that starts in X minutes, but of course, watching shows takes priority.

// Every episode of the show that Chef is watching, is 24 minutes long.
// If he starts watching a new episode now, will he finish watching it strictly before the exam starts?

import java.util.*;

class just_one
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int time_rem = sc.nextInt();
		    
		    System.out.println((time_rem >24) ? "YES" : "NO");
		}

	}
}
