//Chef has two numbers A and B.
//In one operation, Chef can choose either A or B and multiply it by 2.
//Determine whether he can make both A and B equal after any number (possibly, zero) of moves.

import java.util.Scanner;
class a_equals_b
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		int A = read.nextInt();
    		int B = read.nextInt();
    		
    		// Declare variables for lower and higher of the 2 numbers
    		int minAB = Math.min(A, B);
    		int maxAB = Math.max(A, B);
    		int flag = 0;
    		
    		
    		while(minAB <= maxAB){
    		    // condition is met, hence set flag = 1
    		    if(minAB == maxAB){
    		        flag = 1;
    		        break;
    		    }
    		    else{
    		        // update the minimum value as per the problem statement
    		        minAB = minAB * 2;
    		    }
    		}
    		if(flag ==1){
    		    System.out.println("YES");
    		}
    		else{
    		    System.out.println("NO");
    		}
		}
	}
}