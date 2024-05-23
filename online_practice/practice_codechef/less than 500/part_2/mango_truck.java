// You are given that a mango weighs X kilograms and a truck weighs Y kilograms. 
// You want to cross a bridge that can withstand a weight of Z kilograms.

// Find the maximum number of mangoes you can load in the truck so that you can cross the bridge safely.

import java.util.*;

class mango
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int weight_mango = sc.nextInt();
		    int weight_truck = sc.nextInt();
		    int weight_bridge = sc.nextInt();
		    
		    int max = weight_bridge - weight_truck;
		    int load = max / weight_mango;
		    System.out.println(load);
		}

	}
}
