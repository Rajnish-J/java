// Ezio can manipulate at most X number of guards with the apple of eden.
// Given that there are Y number of guards, predict if he can safely manipulate all of them.

import java.util.*;

class Ezio
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int manipulate = sc.nextInt();
		    int staff = sc.nextInt();
		    
		    System.out.println((manipulate >= staff) ? "YES" : "NO");
		}

	}
}
