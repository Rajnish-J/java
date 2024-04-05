// There is a cricket match going on between two teams A and B.

// Team B is batting second and got a target of X runs. Currently, team B has scored Y runs. 
//Determine how many more runs Team B should score to win the match.

// Note: The target score in cricket matches is one more than the number of runs scored by the team that batted first.

import java.util.*;
class target {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    
		    int res = X - Y;
		    System.out.println(res);
		}
    }
}
