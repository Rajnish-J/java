// In the medieval age, there were 3 kingdoms A, B, and C. The army of these kingdom had Na, Nb and  Nc soldiers respectively.

// You are given that an army with X soldiers can defeat an army with Y soldiers only if X>Y.
// An army is said to be dominant if it can defeat both the other armies combined. 
// For example, kingdom C's army will be dominant only if Nc > Na + Nb.
// Determine whether any of the armies is dominant or not.

import java.util.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-->0){
	        int soldiers_1 = sc.nextInt();
	        int soldiers_2 = sc.nextInt();
	        int soldiers_3 = sc.nextInt();
	        
	        if((soldiers_1 + soldiers_2) < soldiers_3 || (soldiers_2 + soldiers_3) < soldiers_1 || (soldiers_1 + soldiers_3) < soldiers_2){
	            System.out.println("YES");
	        }
	        else{
	            System.out.println("NO");
	        }
 	    }

	}
}
