// The doctor prescribed Chef to take a multivitamin tablet 3 times a day for the next X days.
// Chef already has Y multivitamin tablets.

// Determine if Chef has enough tablets for these X days or not.

import java.util.*;

class tablets
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int days = sc.nextInt();
		    int tablets = sc.nextInt();
		    
		    System.out.println(((days * 3) <= tablets) ? "YES" : "NO");
		}

	}
}
