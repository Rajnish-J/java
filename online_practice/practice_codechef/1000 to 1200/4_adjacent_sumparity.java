/*
Adjacent Sum Parity
Chef has an array A of length N.
Chef forms a binary array B of length N using the parity of the sums of adjacent elements in A. Formally, 

* 𝐵𝑖 = (𝐴𝑖 + 𝐴𝑖 + 1) % 2 for (1 ≤ i ≤ N−1)
* Bi = (Ai + Ai + 1) %2 for 
here x%y denotes the remainder obtained when x is divided by y.

Chef lost the array A and needs your help. Given array B, determine whether there exits any valid array A which could have formed B.
 */

 import java.util.Scanner;

class adjacent_sumparity {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0)
		{
		    int n=sc.nextInt();
		    int[] binarray=new int[n];
		    int i,j,count=0;
		    for(i=0;i<binarray.length;i++)
		    {
		        binarray[i]=sc.nextInt();
		        if(binarray[i]==1)
		            count++;
		    }
		    if(count%2==0)
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		}
	}    
}
