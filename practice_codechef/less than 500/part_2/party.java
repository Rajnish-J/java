// Chef wants to give a burger party to all his N friends i.e. he wants to buy one burger for each of his friends.
// The cost of each burger is X rupees while Chef has a total of K rupees.

// Determine whether he has enough money to buy a burger for each of his friends or not.

import java.util.*;

class party
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int friends = sc.nextInt();
		    int burger_size = sc.nextInt();
		    int money = sc.nextInt();
		    
		    System.out.println((money >= (friends * burger_size))? "YES" : "NO");
		}

	}
}
