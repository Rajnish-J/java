// There are G girl and B boy students at IIT (BHU) such that B>G.

// If ICM were a team game where teams could only be of size 2, having exactly 1 girl student and 1 boy student, 
// what would be the minimum number of boy students from IIT (BHU) who would not be able to participate?

import java.util.*;

class game
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0){
		    
		    int girls = sc.nextInt();
		    int boys = sc.nextInt();
		    
		    if(boys>girls){
		        System.out.println(boys-girls);
		    }
		    if(boys<girls){
		        System.out.println(girls - boys);
		    }
		    if(boys == girls){
		        System.out.println("boys");
		    }
		}

	}
}
