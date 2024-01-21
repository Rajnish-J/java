// In the light of G-20 summit, government has decided to keep the average air quality index (AQI) strictly below 100.
// On some random day, Chef measures the AQI and found the value to be X.

// Find whether the government was able to keep the AQI within limits.

import java.util.*;

class g_20
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
	    int air_index = sc.nextInt();
	    
	    System.out.println((air_index<100) ? "YES" : "NO");

	}
}
