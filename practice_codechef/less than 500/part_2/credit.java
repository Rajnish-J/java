// To access CRED programs, one needs to have a credit score of 750 or more.
// Given that the present credit score is X, determine if one can access CRED programs or not.

// If it is possible to access CRED programs, output YES, otherwise output NO.

import java.util.*;

class crediit
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int score = sc.nextInt();
	    System.out.println((score >= 750) ? "YES" : "NO");

	}
}
