// Chef organised a 30 kilometres marathon in Chefland.
// The participants receive medals on completing the marathon as following:

// * If the total time taken is less than 3 hours, they receive a GOLD medal.
// * If the total time taken is greater than equal to 3 hours but less than 6 hours, they receive a SILVER medal.
// * If the total time taken is greater than equal to 6 hours, they receive a BRONZE medal.

// Chefina participated in the marathon and completed it in X hours. Which medal would she receive?

import java.util.*;

class oct_marathon
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner (System.in);
	    
	    int time_taken = sc.nextInt();
	    
	    if(time_taken<3){
	        System.out.println("GOLD");
	    }
	    if((time_taken>=3) && (time_taken<6)){
	        System.out.println("SILVER");
	    }
	    if(time_taken>=6){
	        System.out.println("BRONZE");
	    }

	}
}
