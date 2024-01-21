// Chef's phone shows a Battery Low notification if the battery level is 15% or less.
// Given that the battery level of Chef's phone is X%, determine whether it would show a Battery low notification.

import java.util.*;

class Battery
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int Battery_percentage = sc.nextInt();
		    
		    System.out.println((Battery_percentage >= 16) ? "No" : "Yes");
		}

	}
}
