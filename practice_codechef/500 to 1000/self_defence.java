/*
Self Defence Training

After the phenomenal success of the 36th Chamber of Shaolin, San Te has decided to start 37th Chamber of Shaolin. 
The aim this time is to equip women with shaolin self-defence techniques.

The only condition for a woman to be eligible for the special training is that she must be between 10 and 60 years of age, inclusive of both 10 and 60.

Given the ages of N women in his village, please help San Te find out how many of them are eligible for the special training.
 */

import java.util.*;

class defence{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int size = sc.nextInt();
            int[] women = new int[size];
            
            for(int i = 0; i<size; i++){
                women[i] = sc.nextInt();
            }
            int count = 0;
            for(int i = 0; i<size; i++){
                if((women[i]>=10) && (women[i]<=60)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}