// Om has X rupees. He wants to gift a laptop worth N rupees to his girlfriend.
// We know that Om is the technical secretary of IIIT-A and has access to the Gymkhana funds of IIIT-A. 
// Currently there are M rupees in the fund and Om can use the fund as much as he wants.

// Find whether Om can gift his girlfriend a new laptop.

import java.util.*;

class gift
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int om_have = sc.nextInt();
		int prize = sc.nextInt();
		int om_fund = sc.nextInt();
		
		System.out.println(((om_have + om_fund) >= prize) ? "YES" : "NO");

	}
}
