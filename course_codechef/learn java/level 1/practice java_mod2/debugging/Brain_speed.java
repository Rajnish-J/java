import java.util.*;
import java.lang.*;
import java.io.*;

//In ChefLand, human brain speed is measured in bits per second (bps). Chef has a threshold limit of 
//X bits per second above which his calculations are prone to errors. If Chef is currently working at 
//Y bits per second, is he prone to errors?
//If Chef is prone to errors print YES, otherwise print NO.
/* package codechef; // don't place package name! */
/* Name of the class has to be "Main" only if the class is public. */

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
	        int X = sc.nextInt(), Y = sc.nextInt();
	        
	   
	        if(X>=Y){
	            System.out.println("NO");
	        }
	        else{
	            System.out.println("YES");
	        }
	        
	}
}
