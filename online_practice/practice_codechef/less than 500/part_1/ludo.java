// Chef is playing Ludo. According to the rules of Ludo, 
// a player can enter a new token into the play only when he rolls a 6 on the die.

// In the current turn, Chef rolled the number X on the die. 
// Determine if Chef can enter a new token into the play in the current turn or not.

import java.util.*;

class Ludo
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int chance = sc.nextInt();
		    if(chance == 6){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
