// Complementary Strand in a DNA

// You are given the sequence of Nucleotides of one strand of DNA through a string S of length N. S contains the character A,T,C, and G only.

// Chef knows that:
// * A is complementary to T.
// * T is complementary to A.
// * C is complementary to G.
// * G is complementary to C.

// Using the string S, determine the sequence of the complementary strand of the DNA.

/* package codechef; // don't place package name! */

import java.util.*;

class DNA
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    int size = sc.nextInt();
		    String st = sc.next();
		    for(int i = 0; i < size; i++)
		    {
		        int j=st.charAt(i);
		        if(j=='A')
		        System.out.print("T");
		        else if(j=='T')
		        System.out.print("A");
		        else if(j=='C')
		        System.out.print("G");
		        else
		        System.out.print("C");
		    }
		    System.out.println();
		}
	}
}