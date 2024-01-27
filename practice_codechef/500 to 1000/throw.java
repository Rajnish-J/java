// Discus Throw

// In discus throw, a player is given 3 throws and the throw with the longest distance is regarded as their final score.
// You are given the distances for all 3 throws of a player. Determine the final score of the player.

import java.util.*;

class discus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){

        int first_num = sc.nextInt();
        int second_num = sc.nextInt();
        int third_num = sc.nextInt();

            if((first_num == second_num) && (first_num == third_num)){
                System.out.println(first_num);
            }
            else if((first_num >= second_num) && (first_num >= third_num)){
                if(first_num == second_num){
                    System.out.println(first_num);
                }
                else if(first_num == third_num){
                    System.out.println(first_num);
                    }
                else{
                    System.out.println(first_num);
                    }
            }
            else if((second_num >= first_num) && (second_num >= third_num)){
                if(second_num == third_num){
                    System.out.println(second_num);
                }
                else{
                    System.out.println(second_num);
                }
            }
            else{
                System.out.println(third_num);
            }
        }
    }
}