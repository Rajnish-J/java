// You are given 3 numbers A,B, and C.
// Determine whether the average of A and B is strictly greater than C or not?

//NOTE: Average of A and B is defined as (A+B)/2. For example, average of 5 and 9 is 7, average of 5 and 8 is 6.5

import java.util.*;

class greater_average
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int C = sc.nextInt();
		    
		    System.out.println(((A + B)*0.5) > C ? "YES" : "NO");
		}

	}
}