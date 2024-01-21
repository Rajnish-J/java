// Chef has to travel to another place. For this, he can avail any one of two cab services.
// The first cab service charges X rupees.
// The second cab service charges Y rupees.
// Chef wants to spend the minimum amount of money. Which cab service should Chef take?

import java.util.*;

class Cheeap
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    
		    int cab_one = sc.nextInt();
		    int cab_two = sc.nextInt();
		    
		    System.out.println(((cab_two > cab_one) ? "FIRST" : (cab_one > cab_two) ? "SECOND" : (cab_two == cab_one) ? "ANY" : 0));
		}

	}
}
