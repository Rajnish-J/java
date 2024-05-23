// There are three friends and a total of N candies.
// There will be a fight amongst the friends if all of them do not get the same number of candies.

// Chef wants to divide all the candies such that there is no fight. Find whether such distribution is possible.

import java.util.*;
class candy_division {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
	    int t = sc.nextInt();
	    while(t-->0){
	        int num = sc.nextInt();
	        System.out.println((num%3 == 0) ? "YES" : "NO");
	    }
    }
}
