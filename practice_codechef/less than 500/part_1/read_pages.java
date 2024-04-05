// Chef has started studying for the upcoming test. The textbook has N pages in total. 
// Chef wants to read at most X pages a day for Y days.

// Find out whether it is possible for Chef to complete the whole book.

import java.util.*;

class pages_read
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int pages = sc.nextInt();
		    int read_pages = sc.nextInt();
		    int daily = sc.nextInt();
		    
		    System.out.println(((read_pages*daily) >= pages)? "YES" : "NO");
		}

	}
}
