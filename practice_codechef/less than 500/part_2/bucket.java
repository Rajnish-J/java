// Chef has a bucket having a capacity of K liters. It is already filled with X liters of water.
// Find the maximum amount of extra water in liters that Chef can fill in the bucket without overflowing.

import java.util.*;

class bucket 
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int having = sc.nextInt();
		    int limit = sc.nextInt();
		    
		    System.out.println(having - limit);
		}

	}
}
