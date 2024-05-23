// Chef wants to gift C chocolates to Botswal on his birthday. However, he has only X chocolates with him.
// The cost of 1 chocolate is Y rupees.

// Find the minimum money in rupees Chef needs to spend so that he can gift C chocolates to Botswal.

import java.util.*;

class choco
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int choco_gift = sc.nextInt();
		    int choco_have = sc.nextInt();
		    int price = sc.nextInt();
		    
		    System.out.println((choco_gift - choco_have) * price);
		}

	}
}
