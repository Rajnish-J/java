// There are N bikes and M cars on the road. Each bike has 2 tyres. Each car has 4 tyres. Find the total number of tyres on the road.

import java.util.*;

class trye
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-->0){
	        int bikes = sc.nextInt();
	        int cars = sc.nextInt();
	        
	        System.out.println((bikes * 2) + (cars * 4));
	    }

	}
}
