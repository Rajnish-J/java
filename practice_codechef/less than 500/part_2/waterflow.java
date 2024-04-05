// Alice has a bucket of water initially having W litres of water in it. The maximum capacity of the bucket is X liters.

// Alice turned on the tap and the water starts flowing into the bucket at a rate of Y litres/hour. She left the tap running for exactly Z hours.
// Determine whether the bucket has been overflown, filled exactly, or is still left unfilled.

import java.util.*;
class flow
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int initial = sc.nextInt();
		    int capacity = sc.nextInt();
		    int opened = sc.nextInt();
		    int hours = sc.nextInt();
		    
		    System.out.println((initial) + (opened * hours) > capacity ? "Overflow" : (initial) + (opened * hours) ==  capacity ? "Filled" : 
            (initial) + (opened * hours) < capacity ? "Unfilled" : 0);
		}

	}
}
