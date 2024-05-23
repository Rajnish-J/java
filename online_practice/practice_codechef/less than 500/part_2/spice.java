// Each item in Chef’s menu is assigned a spice level from 1 to 10. Based on the spice level, the item is categorised as:

// * MILD: If the spice level is less than 4.
// * MEDIUM: If the spice level is greater than equal to 4 but less than 7.
// * HOT: If the spice level is greater than equal to 7.

// Given that the spice level of an item is X, find the category it lies in.

import java.util.*;

class spice_level
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int spice = sc.nextInt();
		    
		    System.out.println( (spice < 4) ? "MILD" : (spice>=4 && spice<7) ? "MEDIUM" : "HOT" );
		}
	}
}
