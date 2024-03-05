/*
Mutated Minions
Gru has not been in the limelight for a long time and is, therefore, planning something particularly nefarious. 
Frustrated by his minions' incapability which has kept him away from the limelight, he has built a transmogrifier — a machine which mutates minions.

Each minion has an intrinsic characteristic value (similar to our DNA), which is an integer. 
The transmogrifier adds an integer K to each of the minions' characteristic value.

Gru knows that if the new characteristic value of a minion is divisible by 7, then it will have Wolverine-like mutations.

Given the initial characteristic integers of N minions, all of which are then transmogrified, find out how many of them become Wolverine-like.
 */

import java.util.*;

class minion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int size = sc.nextInt();
            int value = sc.nextInt();
            int count = 0;
            int[] arr = new int[size];

            for(int i = 0; i<size; i++){
                arr[i] = sc.nextInt();
            }

            for(int i = 0; i<size; i++){
                if((arr[i] + value) % 7 == 0){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}