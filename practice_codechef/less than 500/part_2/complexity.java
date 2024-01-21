// A sorting algorithm A is said to have more time complexity than a sorting algorithm B, 
// if it uses more number of comparisons for sorting the same array than algorithm B.

// Given that algorithm A uses X comparisons to sort an array and algorithm B uses Y comparisons to sort the same array, 
// find whether algorithm A has more time complexity.

import java.util.*;

class time
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner (System.in);
	    int t = sc.nextInt();
	    while(t-->0){
	        int A = sc.nextInt();
	        int B = sc.nextInt();
	        
	        System.out.println((A>B) ? "YES" : "NO");
	    }

	}
}
