// Problem Statement
// Write a program that accepts sets of three numbers, and prints the second-maximum number among the three.

import java.util.*;

class second_largest
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    
		    for(int i = 0; i<n ; i++){
		        arr[i] = sc.nextInt();
		    }
		    Arrays.sort(arr);
		    System.out.println(arr[1]);
		}

	}
}
