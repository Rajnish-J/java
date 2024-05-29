/*
Bear and Candies 123

Bears love candies and games involving eating them. Limak and Bob play the following game. 
Limak eats 1 candy, then Bob eats 2 candies, then Limak eats 3 candies, then Bob eats 4 candies, and so on. Once someone can't eat what he is supposed to eat, he loses.

Limak can eat at most A candies in total (otherwise he would become sick), while Bob can eat at most B candies in total. 
Who will win the game? Print "Limak" or "Bob" accordingly.
 */

import java.util.*;

class bear_candies {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
		for(int i=0; i<t; i++){
		    int bob = sc.nextInt();
		    int limak = sc.nextInt();
		    int x = 1;
		    while(bob>=0 && limak>=0){
		        if(x%2==1){
		            bob -= x;
		        }
		        else{
		            limak -= x;
		        }
		        x =+ 1;
		    }
		    if(bob<0){
		        System.out.println("Bob");
		    }
		    else{
		        System.out.println("Limak");
		    }
		}
	}
}