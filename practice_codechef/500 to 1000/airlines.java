/*
Airlines

An airline operates X aircraft every day. Each aircraft can carry up to 100 passengers.
One day, N passengers would like to travel to the same destination. What is the minimum number of new planes that the airline must buy to carry all N passengers?
 */

import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t-->0)
	 {
	  int x=sc.nextInt();
	  int n=sc.nextInt();
	  if(n%100==0)
	  {
	      if(n>x*100)
	      System.out.println((n/100)-x);
	      else
	      System.out.println(0);
	  }
	  else
	  {
	      if(n>x*100)
	      System.out.println(((n-x*100)/100)+1);
	      else
	      System.out.println(0);
	  }
	 }
	}
}