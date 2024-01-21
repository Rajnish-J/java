// Chef has his lunch only between 1 pm and 4 pm (both inclusive).
// Given that the current time is X pm, find out whether it is lunchtime for Chef.

import java.util.*;

class lunch_time
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int time = sc.nextInt();
		    System.out.println(((time >= 1) && (time<=4)) ? "YES" : "NO");
		}

	}
}
