// Chef was driving on a highway at a speed of X km/hour.
// To avoid accidents, there are fine imposed on overspeeding as follows:

// No fine if the speed of the car ≤70 km/hour.
// Rs 500 fine if the speed of the car is strictly greater than 70 and ≤ 100.
// Rs 2000 fine if the speed of the car is strictly greater than 100.

import java.util.*;

class speeding
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0){
		    
		    int chef_speed = sc.nextInt();
		    
		    if(chef_speed<=70){
		        System.out.println(0);
		    }
		    if((chef_speed>70)&&(chef_speed<=100)){
		        System.out.println(500);
		    }
		    if(chef_speed>100){
		        System.out.println(2000);
		    }
		}

	}
}
