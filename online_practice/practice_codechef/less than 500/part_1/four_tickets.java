// Four friends want to attend a concert. Each ticket costs X rupees.
// They have decided to go to the concert if and only if the total cost of the tickets does not exceed 1000 rupees.
// Determine whether they will be going to the concert or not.

import java.util.*;

class four_tickets
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    
		    int ticket_prize = sc.nextInt();
		    System.out.println((ticket_prize * 4) <= 1000?"YES" : "NO");
		}

	}
}
