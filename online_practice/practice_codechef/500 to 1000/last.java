// The Last Levels

// Chef is playing a videogame, and is getting close to the end. He decides to finish the rest of the game in a single session.
// There are X levels remaining in the game, and each level takes Chef Y minutes to complete. 
// To protect against eye strain, Chef also decides that every time he completes 3 levels, he will take a Z minute break from playing. 
// Note that there is no need to take this break if the game has been completed.

// How much time (in minutes) will it take Chef to complete the game?

import java.util.*;

class last{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int levels_rem = sc.nextInt();
            int minutes = sc.nextInt();
            int break_time = sc.nextInt();

            if(levels_rem % 3 != 0){
                System.out.println((levels_rem * minutes) + (levels_rem / 3) * break_time);
            }
            if(levels_rem % 3 == 0){
                System.out.println((levels_rem * minutes) + ((levels_rem / 3) - 1) * break_time);
            }
        }
    }
}