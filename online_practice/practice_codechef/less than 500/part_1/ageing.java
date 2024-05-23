// Chef's current age is 20 years, while Chefina's current age is 10 years.
// Determine Chefina's age when Chef will be X years old.
// Note: Assume that Chef and Chefina were born on same day and same month (just different year).

import java.util.*;
class ageing {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int chef = sc.nextInt();
		    System.out.println(chef - 10);
		}
    }
}
