// The working hours of Chef’s kitchen are from X pm to Y pm (1≤X<Y≤12).
// Find the number of hours Chef works.

import java.util.*;

class kitchen
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0){
		    
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    
		    System.out.println(y-x);
		    
		}

	}
}
