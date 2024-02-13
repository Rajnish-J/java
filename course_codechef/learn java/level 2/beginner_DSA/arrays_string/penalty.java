//Using your current knowledge of arrays - you can solve the following problem!
//Task
//It's the soccer match finals in Chefland and as always it has reached the penalty shootouts.
// * Each team is given 5 shots to make and the team scoring a goal on the maximum number of shots wins the game.
// *If both the teams' scores are equal, then the game is considered a draw and we would have 2 champions.

//Given ten integers A1 to A10, determine the winner or find if the game ends in a draw.
// *the odd indexed integers represent the outcome of the shots made by team 1
// *the even indexed integers represent the outcome of the shots made by team 2

//Note that here Ai = 1 indicates that it's a goal and Ai =0 indicates a miss.

import java.util.*;
class penalty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
        
        int[] scores = new int[10];
        for (int i = 0; i < 10; i++) {
            scores[i] = scanner.nextInt();
        }
        
        int team1Goals = 0;
        int team2Goals = 0;
        
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) { // Even indices represent team 2's shots
                team2Goals += scores[i];
            } else { // Odd indices represent team 1's shots
                team1Goals += scores[i];
            }
        }
        
        if (team1Goals > team2Goals) {
            System.out.println("2");
        } else if (team2Goals > team1Goals) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        }
    }
}
