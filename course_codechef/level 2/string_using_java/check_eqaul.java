//Chef wants to implement wildcard pattern matching supporting only the wildcard '?'. 
//The wildcard character '?' can be substituted by any single lower case English letter for matching. 
//He has two strings X and Y of equal length, made up of lower case letters and the character '?'. 
//He wants to know whether the strings X and Y can be matched or not.

import java.util.Scanner;
class check_eqaul {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i=0;i<t;i++)
		{
		    String x = scan.next();
		    String y = scan.next();
		    boolean flag = false;
		    
		    for(int j=0;j<x.length();j++)
		    {
		        if(x.charAt(j) == y.charAt(j))
		        {
		            flag = true;
		        }
		        else if(x.charAt(j) == '?' || y.charAt(j) == '?')
		        {
		            flag = true;
		        }
		        else
		        {
		            flag = false;
		            break;
		        }
		    }
		    if(flag == true)
		    {
		        System.out.println("Yes");
		    }
		    else
		    {
		        System.out.println("No");
		    }
		}
    }
}
