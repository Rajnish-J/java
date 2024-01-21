// Chef considers the climate HOT if the temperature is above 20, otherwise he considers it COLD. 
// You are given the temperature C, find whether the climate is HOT or COLD.

import java.util.*;

class hot_or_cold
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    
		    int temp = sc.nextInt();
		    System.out.println((temp > 20) ? "HOT" : "COLD");
		}

	}
}
