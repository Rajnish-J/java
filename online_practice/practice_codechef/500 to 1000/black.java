// Blackjack

// Chef is playing a variant of Blackjack, where 3 numbers are drawn and each number lies between 1 and 10 (with both 1 and 10 inclusive). 
// Chef wins the game when the sum of these 3 numbers is exactly 21.

// Given the first two numbers A and B, that have been drawn by Chef, what should be 3-rd number that should be drawn by the Chef in order to win the game?
// Note that it is possible that Chef cannot win the game, no matter what is the 3-rd number. In such cases, report 1 as the answer.

import java.util.*;

class blackjack{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int num_1 = sc.nextInt();
            int num_2 = sc.nextInt();

            if(21 - (num_1 + num_2) > 10){
                System.out.println(-1);
            }
            else{
                System.out.println(21 - (num_1 + num_2));
            }

        }
    }
}