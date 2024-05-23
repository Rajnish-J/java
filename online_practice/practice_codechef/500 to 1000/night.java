// Jenga Night

// Chef hosts a party for his birthday. There are N people at the party. All these N people decide to play Jenga.
// There are X Jenga tiles available. In one round, all the players pick 1 tile each and place it in the tower. The game is valid if:

// * All the players have a tile in each round;
// * All the tiles are used at the end.

// Given N and X, find whether the game is valid.

import java.util.*;

class night{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int people = sc.nextInt();
            int tile = sc.nextInt();

            System.out.println(((people <= tile) && (tile % people == 0)) ? "YES" : "NO");
        }
    }
}