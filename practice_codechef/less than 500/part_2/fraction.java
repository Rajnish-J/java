// Consider a fraction a/b. Its Height is defined as the maximum of its numerator and denominator. 
// So, for example, the Height of 3/19 would be 19, and the Height of 27 / 4 would be 27.

// Given a and b, find the Height of a/b.

import java.util.*;

class frac
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(Math.max(a,b));
	}
}
