// Chef has opened a new airline. Chef has 10 airplanes where each airplane has a capacity of X passengers.
// On the first day itself, Y people are willing to book a seat in any one of Chef's airplanes.

// Given that Chef charges Z rupees for each ticket, find the maximum amount he can earn on the first day.

import java.util.*;

class airlines
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int capacity = sc.nextInt();
		    int seat = sc.nextInt();
		    int cost = sc.nextInt();
		    int want = 0;
		    
		    int total_seat = 10 * capacity;
		    if(total_seat > seat){
		        want = seat;
		    }
		    else{
		        want = total_seat;
		    }
		    System.out.println(want * cost);
		}

	}
}
