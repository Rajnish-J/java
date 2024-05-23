// Chef's son wants to go on a roller coaster ride. 
// The height of Chef's son is X inches while the minimum height required to go on the ride is H inches. 
// Determine whether he can go on the ride or not.

import java.util.*;
class roller_coster {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int son_height = sc.nextInt();
		    int min_height = sc.nextInt();
		    
		    System.out.println((son_height >= min_height) ? "YES" : "NO");
		}
    }
}
