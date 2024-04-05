/*
Single-use Attack
Chef is playing a video game, and is now fighting the final boss.

The boss has H health points. Each attack of Chef reduces the health of the boss by X.

Chef also has a special attack that can be used at most once, and will decrease the health of the boss by Y.

Chef wins when the health of the boss is ≤0.
What is the minimum number of attacks needed by Chef to win?
 */

import java.util.*;

class attack{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int health = sc.nextInt();
            int normal = sc.nextInt();
            int special = sc.nextInt();
            
         if(health-special<=0)
         System.out.println("1");
		  else
		  {
		   int specialattackcombo= (int)(Math.ceil((double)(health-special)/normal))+1;
		   System.out.println(specialattackcombo);
		 
            }
        }
    }
}