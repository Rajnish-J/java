// Chef has a rectangular plate of length N cm and width Mcm. He wants to make a wireframe around the plate. 
// The wireframe costs X rupees per cm.
// Determine the cost Chef needs to incur to buy the wireframe.

import java.util.*;

class framzz
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner (System.in);
	    int t = sc.nextInt();
	    while(t-->0){
	        int length = sc.nextInt();
	        int width = sc.nextInt();
	        int cost = sc.nextInt();
	        
	        int peri = 2 * (length + width);
	        int tot_cost = cost * peri;
	        
	        System.out.println(tot_cost);
	    }

	}
}
