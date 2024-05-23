/*
Cup Finals
It is the World Cup Finals. Chef only finds a match interesting if the skill difference of the competing teams is less than or equal to D.

Given that the skills of the teams competing in the final are X and Y respectively, determine whether Chef will find the game interesting or not.
 */

import java.util.*;

class cup_interest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int team_1 = sc.nextInt();
            int team_2 = sc.nextInt();
            int difference = sc.nextInt();
            if(team_1>=team_2){
                if((team_1-team_2)<=difference){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
                if((team_2-team_1)<=difference){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
}