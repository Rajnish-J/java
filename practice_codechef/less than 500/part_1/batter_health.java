// Apple considers any iPhone with a battery health of 80% or above, to be in optimal condition.
// Given that your iPhone has X% battery health, find whether it is in optimal condition.

import java.util.*;
class batter_health {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int percentage = sc.nextInt();
		    System.out.println((percentage >= 80)&&(percentage<=100) ? "YES" : "NO");
		}
    }
}
