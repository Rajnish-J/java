/*
Chef's colleague issued a challenge to Chef: "If you eat more than X mozzarella sticks, I'll give you 30 rupees for each extra one you eat".
For example, if X=5 and Chef eats 8 sticks, he would receive 90 rupees because he ate 3 extra sticks.

You know that the restaurant serves Y mozzarella sticks per plate.
You also know that Chef received R rupees from his colleague as a result of the challenge.

What's the maximum number of plates of mozzarella sticks that Chef could have ordered?
 */

import java.util.*;

class snack{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int ate_initial = sc.nextInt();
            int per_plate = sc.nextInt();
            int chef_get = sc.nextInt();

            int bonus = chef_get / 30;
            int total = ate_initial + bonus;
            int calc = total / per_plate;

            if(calc % 10 ==0){
                System.out.println(calc);
            }
            else{
                System.out.println(calc++);
            }
        }        
    }
}