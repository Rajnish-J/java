/*
 * Chef Eren
Chef is a very big fan of Eren Yeager.
In the last season of Attack on Titan, there were N episodes numbered from 1 to N.
Each even indexed episode was A minutes long and each odd indexed episode was B minutes long.

Calculate the total duration (in minutes) of the last season.
 */

/* package codechef; // don't place package name! */

import java.util.*;

/* package codechef; // don't place package name! */

import java.util.*;
class Eren
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		    int N=sc.nextInt();
		    int A=sc.nextInt();
		    int B=sc.nextInt();
		    int even=0;
		    int odd=0;
		    if (N>1){
		        if (N%2==0){
		            System.out.println(((N/2)*A)+((N/2)*B));
		        }
		        else{
		            System.out.println((((N/2)+1)*B)+((N/2)*A));
		        }
		        
		    }
		    else{
		        System.out.println(B);
		    }
		    
		}
		
	}
}