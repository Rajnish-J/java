// Chef is the financial incharge of Chefland and one of his duties is identifying.
// if any company has gained a monopolistic advantage in the market.

// There are exactly 3 companies in the market each of whose revenues are denoted by R1, R2 and R3 respectively. 
// A company is said to have a monopolistic advantage if its revenue is strictly greater than the sum of the revenues of its competitors.

// Given the revenue of the 3 companies, help Chef determine if any of them has a monopolistic advantage.

/* package codechef; // don't place package name! */

import java.util.*;
class chefland
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    if(a+c<b || a+b<c || b+c<a ){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}