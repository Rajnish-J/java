// On the occasion of World Blood Donor Day, Chef has organized an event to reward regular blood donars in Chefland.

// If the donor has made less than or equal to 3 donations, they receive a BRONZE donor badge.
// If the donor has made more than 3 but less than equal to 6 donations, they receive a SILVER donor badge.
// If the donor has made more than 6 donations, they receive a GOLD donor badge.

// Given that a person has made X donations, find the badge they receive.

import java.util.*;

class rewards
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int medal = sc.nextInt();
		    
		    System.out.println(((medal <= 3) ? "BRONZE" : ((medal > 3) && (medal <= 6)) ? "SILVER" : "GOLD"));
		}

	}
}
