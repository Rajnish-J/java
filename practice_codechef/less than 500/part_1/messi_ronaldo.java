// In Chefland, a football player gets 2 points for each goal and 1 point for each assist.
// Messi has A goals and B assists this season, whereas Ronaldo has X goals and Y assists.
// Find out the player with more points this season.

import java.util.*;

class messi_ronaldo
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		
		int messi = sc.nextInt();
		int messi_assi = sc.nextInt();
		int ronaldo = sc.nextInt();
		int ronaldo_assi = sc.nextInt();
		
		int team_1 = ((messi*2) + messi_assi);
		int team_2 = ((ronaldo*2) + ronaldo_assi);
		
		if(team_1>team_2){
		    System.out.println("Messi");
		}
		if(team_1<team_2){
		    System.out.println("Ronaldo");
		}
		if(team_1 == team_2){
		    System.out.println("Equal");
		}

	}
}
