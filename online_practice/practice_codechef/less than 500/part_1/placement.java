// Chef appeared for a placement test.
// There is a problem worth X points. Chef finds out that the problem has exactly 10 test cases. 
// It is known that each test case is worth the same number of points.
// Chef passes N test cases among them. Determine the score Chef will get.

import java.util.*;

class placement
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int points = sc.nextInt();
		    int attempted = sc.nextInt();
		    int value = points/10;
		    
		    System.out.println(attempted*value);
		}
	}
}
