// Chef is not feeling well today. He measured his body temperature using a thermometer and it came out to be X °F.
// A person is said to have fever if his body temperature is strictly greater than 98 °F.

// Determine if Chef has fever or not.

import java.util.*;

class fever
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int temp = sc.nextInt();
		    
		    System.out.println((temp>98) ? "YES" : "NO");
		}

	}
}
