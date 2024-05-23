// Chef defines a group of three friends as a perfect group if the age of one person is equal to the sum of the age of remaining two people.

// Given that, the ages of three people in a group are A,B, and C respectively, find whether the group is perfect.

import java.util.*;

class trio
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    
		    System.out.println((a + b) == c ? "YES" : (a + c) == b ? "YES" : (b + c) == a ? "YES" : "NO" );
		}

	}
}
