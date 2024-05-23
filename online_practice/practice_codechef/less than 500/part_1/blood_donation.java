// A blood drive aims to collect N number of blood donations.
// The drive has collected X donations so far. Find the remaining number of donations needed to reach the target.

import java.util.*;

class blood_donation
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0){
		int n = sc.nextInt();
		int x = sc.nextInt();
		int res = n - x;
		
		System.out.println(res);
		}

	}
}
