/*
Best of Two

Alice and Bob are playing a game. Each player rolls a regular six faced dice 3 times.
The score of a player is the sum of the values of the highest 2 rolls. 
The player with the highest score wins, and the game ends in a Tie if both players have the same score.

Find the winner of the game or determine whether it is a tie.
 */

/* package codechef; // don't place package name! */

import java.util.*;

class two
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++){
		    int a1 = sc.nextInt();
		    int a2 = sc.nextInt();
		    int a3 = sc.nextInt();
		    int b1 = sc.nextInt();
		    int b2 = sc.nextInt();
		    int b3 = sc.nextInt();
		    int a = Math.min(a1, Math.min(a2, a3));
		    int b = Math.min(b1, Math.min(b2, b3));
		    int x = a1 + a2 + a3 - a;
		    int y = b1 + b2 + b3 - b;
		    if(x>y){
		        System.out.println("Alice");
		    }
		    else if(x<y){
		        System.out.println("Bob");
		    }
		    else{
		        System.out.println("Tie");
		    }
		}
	}
}