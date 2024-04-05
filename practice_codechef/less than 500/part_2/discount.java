// Alice buys a toy with a selling price of 100 rupees. There is a discount of x percent on the toy. 
// Find the amount Alice needs to pay for it.

import java.util.*;

class dis
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int discount = sc.nextInt();
		    System.out.println(100 - discount);
		}

	}
}
