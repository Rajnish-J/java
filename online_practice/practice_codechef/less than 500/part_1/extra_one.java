// You just bought a new calculator, but it seems to have a small problem: all its results have an extra 1 appended to the end.
// For example, if you ask it for 3 + 5, it'll print 81, and 4 + 12 will result in 161.

// Given A and B, can you predict what the calculator will print when you ask it for A+B?

import java.util.*;

class extra_one
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a + b;
		
		System.out.println(c + "1");

	}
}
