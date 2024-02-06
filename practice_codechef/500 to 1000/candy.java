// Candy Distribution

// Chef has N candies. He has to distribute them to exactly M of his friends such that each friend gets equal number of candies and each friend gets even number of candies. 
// Determine whether it is possible to do so.
// NOTE: Chef will not take any candies himself and will distribute all the candies.

import java.util.*;

class candies{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int candies = sc.nextInt();
            int friends = sc.nextInt();

            System.out.println((candies % friends == 0) && ((candies / friends) % 2 == 0) ? "Yes" : "No");
        }
    }
}