// Chef bought car insurance. The policy of the insurance is:

// * The maximum rebatable amount for any damage is Rs X lakhs.
// * If the amount required for repairing the damage is ≤X lakhs, that amount is rebated in full.

// Chef's car meets an accident and required Rs Y lakhs for repairing.
// Determine the amount that will be rebated by the insurance company.

import java.util.*;

class Insurance
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int damage_repair = sc.nextInt();
		    int Insurance = sc.nextInt();
		    
		    System.out.println((damage_repair > Insurance) ? Insurance : damage_repair);
		}

	}
}
