// Bob has an account in the Bobby Bank. His current account balance is W rupees.
// Each month, the office in which Bob works deposits a fixed amount of X rupees to his account. 
// Y rupees is deducted from Bob's account each month as bank charges.

// Find his final account balance after Z months. Note that the account balance can be negative as well.

import java.util.*;

class bank
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int balance = sc.nextInt();
		    int deposit = sc.nextInt();
		    int charges = sc.nextInt();
		    int months = sc.nextInt();
		    
		    System.out.println(((balance) + (deposit * months)) - (charges * months));
		}

	}
}
