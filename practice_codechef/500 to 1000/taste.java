// Maximise the Tastiness
// Chef is making a dish that consists of exactly two ingredients. 
// He has four ingredients A,B,C and D with tastiness a,b,c, and d respectively. 
// He can use either A or B as the first ingredient and either C or D as the second ingredient.

// The tastiness of a dish is the sum of tastiness of its ingredients. 
// Find the maximum possible tastiness of the dish that the chef can prepare.

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(n-->0){
		    int a=s.nextInt();
		    int b=s.nextInt();
		    int c=s.nextInt();
		    int d=s.nextInt();
		    
		    if(a>b){
		        if(c>d)
		            System.out.println(a+c);
		        else
		            System.out.println(a+d);
		    }
		    else if(a<b){
		        if(c>d)
		            System.out.println(b+c);
		        else
		            System.out.println(b+d);
		    }
		    else
		    System.out.println(a+c);
		}
	}
}