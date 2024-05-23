// A single car can accommodate at most 4 people.

// N friends want to go to a restaurant for a party. Find the minimum number of cars required to accommodate all the friends.

import java.util.*;

class cars{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int friends = sc.nextInt();

            System.out.println((friends <= 4) ? 1 : (friends % 4 == 0) ? friends / 4 : (friends / 4) + 1);
        }
    }
}