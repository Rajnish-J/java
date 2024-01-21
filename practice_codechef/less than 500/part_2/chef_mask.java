// Chef is shopping for masks. In the shop, he encounters 2 types of masks:

// * Disposable Masks — cost X but last only 1 day.
// * Cloth Masks — cost Y but last 10 days.

// Chef wants to buy masks to last him 100 days. 
// He will buy the masks which cost him the least. 
// In case there is a tie in terms of cost, Chef will be eco-friendly and choose the cloth masks. Which type of mask will Chef choose?

import java.util.*;

class mask
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-->0){
	        int disposable = sc.nextInt();
	        int cloth = sc.nextInt();
	        
	        int cost_disposable = 100 * disposable;
	        int cost_cloth = 10 * cloth;
	        
	        System.out.println((cost_cloth > cost_disposable) ? "disposable" : "cloth");
	    }

	}
}
