// Finally, after purchasing a water cooler during the April long challenge, 
// Chef noticed that his water cooler requires 2 liters of water to cool for one hour.

// How much water (in liters) would be required by the cooler to cool for N hours?

import java.util.*;

class water_req
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner (System.in);
	    int t = sc.nextInt();
	    while(t-->0){
	        int water = sc.nextInt();
	        System.out.println(water * 2);
	    }

	}
}
