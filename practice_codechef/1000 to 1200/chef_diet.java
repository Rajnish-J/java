/*
Chef Diet

Read problems statements in Hindi, Mandarin Chinese, Russian, Vietnamese, and Bengali as well.
Chef decided to go on a diet during the following N days (numbered 1 through N). Part of the diet plan is to eat K grams of protein during each day. 

For each valid i, Chef wants to buy Ai grams of protein in the morning of the i-th day and then eat K grams of protein as part of his dinner. 
If he has any protein remaining, he can store it and use it in later dinners. 
Initially, Chef is storing 0 grams of protein.
Determine whether Chef will have enough protein all the time during his diet. 
In case he will not have enough, find the first day on which Chef will be unable to eat K grams of protein.
 */

import java.util.*;

class diet{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-->0){
            int day = sc.nextInt(),protein_perday = sc.nextInt(),sum = 0, index = 0;
            int[] protein = new int[day];
            boolean check = true;
            
            for(int i = 0; i<day;i++){
                protein[i] = sc.nextInt();
            }

            for(int i = 0; i<day ; i++){
                sum += protein[i];
                if(sum >= protein_perday){
                    sum -= protein_perday;
                }
                else{
                    index = i;
                    check = false;
                    break;
                }
            }

            System.out.println((check) ? "YES" : "NO " + (index+1));
        }
    }
}