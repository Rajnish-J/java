// An important resolution is being discussed in the Parliament of Chefland. 
// There are N members present in the Parliament out of which X members voted in favour of the resolution and the remaining voted against it.

// According to the constitution of Chefland, 
// a resolution is passed if and only if half or more than half the members present in the Parliament vote in favour of the resolution.

import java.util.*;

class vote
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int present = sc.nextInt();
		    int voted = sc.nextInt();
		    
		    System.out.println((present <= voted*2) ? "YES" : "NO");
		}

	}
}
