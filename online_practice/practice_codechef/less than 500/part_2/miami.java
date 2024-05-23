// Chef has finally got the chance of his lifetime to drive in the F1 tournament. 
// But, there is one problem. 
// Chef did not know about the 107% rule and now he is worried whether he will be allowed to race in the main event or not.

// Given the fastest finish time as X seconds and Chef's finish time as Y seconds, 
// determine whether Chef will be allowed to race in the main event or not.

// Note that, Chef will only be allowed to race if his finish time is within 107% of the fastest finish time.

import java.util.*;

class race
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int racer_1 = sc.nextInt();
		    int chef = sc.nextInt();
		    
		    System.out.println((racer_1 * 1.07) >= chef ? "YES" : "NO");
		    
		    
		}

	}
}
