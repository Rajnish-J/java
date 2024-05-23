// There is a fair going on in Chefland. Chef wants to visit the fair along with his N friends. Chef manages to collect K passes for the fair. 
// Will Chef be able to enter the fair with all his N friends?

// A person can enter the fair using one pass, and each pass can be used by only one person.

import java.util.*;

class fair
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0){
		    
		    int friends = sc.nextInt();
		    int ava_pass = sc.nextInt();
		    
		    if((friends + 1)<=ava_pass){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}

	}
}
