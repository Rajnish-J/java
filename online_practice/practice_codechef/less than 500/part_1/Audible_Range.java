// Chef's dog binary hears frequencies starting from 67 Hertz to 45000 Hertz (both inclusive).

// If Chef's commands have a frequency of X Hertz, find whether binary can hear them or not.

import java.util.*;
class Audible_Range 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int puppy = sc.nextInt();
		if((puppy>=67) && (puppy<=45000)){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
		}
    }
}
