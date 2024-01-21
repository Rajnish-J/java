// Chef has recently moved into an apartment. It take 30 minutes for Chef to reach office from the apartment.

// Chef left for the office X minutes before Chef was supposed to reach. Determine whether or not Chef will be able to reach on time.

import java.util.*;
class distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int distance = sc.nextInt();
		    if(distance>=30){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
    }
}
