// Chef's coding class is very famous in Chefland.
// This year X students joined his class and each student will require one chair to sit on. 
// Chef already has Y chairs in his class. 
// Determine the minimum number of new chairs Chef must buy so that every student is able to get one chair to sit on.

import java.util.*;

class chair_req
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0){
		    
		    int students = sc.nextInt();
		    int chairs = sc.nextInt();
		    
		    if(chairs<=students){
		    System.out.println(students - chairs);
		    }
		    else{
		        System.out.println("0");
		    }

	    }
    }
}