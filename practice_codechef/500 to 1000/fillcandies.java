// Fill Candies

// Chef received N candies on his birthday. He wants to put these candies in some bags. A bag has K pockets and each pocket can hold at most M candies. 
// Find the minimum number of bags Chef needs so that he can put every candy into a bag.

import java.util.*;

class candies{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int ava_candies = sc.nextInt();
            int packets_bags = sc.nextInt();
            int hold = sc.nextInt();

            int capacity = packets_bags * hold;
            if(ava_candies % capacity == 0){
                System.out.println(ava_candies / capacity);
            }
            else{
                System.out.println((ava_candies / capacity) + 1);
            }
        }
    }
}