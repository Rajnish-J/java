// There were initially X million people in a town, out of which Y million people left the town and Z million people immigrated to this town.
// Determine the final population of town in millions.

import java.util.*;

class city
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0){
		    
		    int exist = sc.nextInt();
		    int leave = sc.nextInt();
		    int migrated = sc.nextInt();
		    
		    System.out.println(exist - leave + migrated);
		}

	}
}
