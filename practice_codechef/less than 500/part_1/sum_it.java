// Bob received an assignment from his school: he has two numbers A and B, and he has to find the sum of these two numbers.
// Alice, being a good friend of Bob, told him that the answer to this question is C.
// Bob doesn't completely trust Alice and asked you to tell him if the answer given by Alice is correct or not.
// If the answer is correct print "YES", otherwise print "NO" (without quotes).

import java.util.*;

class sum_it
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    
		    System.out.println((a+b == c)? "YES" : "NO");
		}

	}
}
