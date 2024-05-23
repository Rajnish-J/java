// Chef is looking to buy a TV and has shortlisted two models. The first one costs A rupees, while the second one costs B rupees.
// Since there is a huge sale coming up on Chefzon, Chef can get a flat discount of C rupees on the first TV, 
// and a flat discount of D rupees on the second one.

// Help Chef determine which of the two TVs would be cheaper to buy during the sale.

import java.util.*;

class TV
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int prize_one = sc.nextInt();
		    int prize_two = sc.nextInt();
		    
		    int discount_one = sc.nextInt();
		    int discount_two = sc.nextInt();
		    
		    int final_one = prize_one - discount_one;
		    int final_two = prize_two - discount_two;
		    
		    System.out.println((final_one > final_two) ? "Second" : ((final_one == final_two) ? "Any" : "First" ));
		}

	}
}
