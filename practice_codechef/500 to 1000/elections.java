// Election season has started in Chefland and the election commission wants to know the count of eligible voters.

// There are N people in Chefland where the age of the ith person in Ai
// Given that a person needs to be at least X years old to vote, find the number of eligible voters.

import java.util.*;

class election{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int voters = sc.nextInt();
            int age_criteria = sc.nextInt();
            int count = 0;

            int[] voters_arr = new int[voters];

            for(int i = 0; i<voters; i++){
                voters_arr[i] = sc.nextInt();
            }

            for(int i = 0; i<voters; i++){
                if(voters_arr[i] >= age_criteria){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}