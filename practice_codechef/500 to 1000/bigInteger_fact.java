// Small factorials
// You are asked to calculate factorials of some small positive integers.

import java.util.*;
import java.math.*;

class Fact
{
	public static void main (String[] args) throws java.lang.Exception
	{
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t --> 0)
            {
                int n = sc.nextInt();
                BigInteger fact = new BigInteger("1");
                for(int i = 2; i <= n; i++)
                fact = fact.multiply(BigInteger.valueOf(i));
                System.out.println(fact);
            }
	    
	}
}



