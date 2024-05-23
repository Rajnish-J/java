/*
Minimum number of Flips
Chef has an array A of length N consisting of 1 and −1 only.

In one operation, Chef can choose any index (1 ≤ i ≤ N) and multiply the element Ai by −1.

Find the minimum number of operations required to make the sum of the array equal to 0. Output -1 if the sum of the array cannot be made 0.
 */

/* package codechef; // don't place package name! */

import java.util.*;

class flips
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int size = sc.nextInt();
		    int[] o = new int[size];
		    int count_1 = 0;
		    int count_neg_1= 0;
		    int  half = size/2;
		    for (int i = 0;i<size ;i++ ){ 
		        o[i] = sc.nextInt();
		            if(o[i]==1)
		                count_1++;
		            else if (o[i]==-1)
		                count_neg_1++;
		    }
		    if (size%2!=0){
		        System.out.println(-1);
		    }		    
		    else {
		        count_neg_1= Math.abs(half-count_neg_1);
		        System.out.println(count_neg_1);
		    }
		}
	}
}