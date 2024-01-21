// Chef has been working hard to compete in MasterChef.
// He is ranked X out of all contestants. However, only 10 contestants would be selected for the finals.

// Check whether Chef made it to the top 10 or not?

import java.util.*;

class MasterChef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		int rank = sc.nextInt();
		if(rank<=10){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
	}		

	}
}
