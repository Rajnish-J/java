// A person is said to be sleep deprived if he slept strictly less than 7 hours in a day.
// Chef was only able to sleep X hours yesterday. Determine if he is sleep deprived or not.

import java.util.*;
class sleep
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int sleep_hours = sc.nextInt();
		    
		    System.out.println((sleep_hours<7) ? "YES" : "NO");
		}

	}
}
