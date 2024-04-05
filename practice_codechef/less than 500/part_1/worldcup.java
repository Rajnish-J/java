// The cricket World Cup has started in Chefland. There are many teams participating in the group stage matches. 
// Any team that scores or more points in the group stage matches qualifies for the next stage.
// You know the score that a particular team has scored in the group stage matches. 
// Determine if the team has qualified for the next stage or not.

import java.util.*;
class cup{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int team_point = sc.nextInt();
		if(team_point>=12){
		    System.out.println("Yes");
		}
		else{
		    System.out.println("No");
		}
    }
}