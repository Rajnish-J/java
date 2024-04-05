// In a certain month, Chef earned X rupees while Chefina earned Y rupees such that Y>X.
// Since they want to end up with exactly the same amount, they decide to donate the difference between their income to a charity.

// Find the amount they donate in the month.
import java.util.*;

class chef_donation
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
        while(t-->0){
            int chef = sc.nextInt();
            int chefina = sc.nextInt();
            
            System.out.println(chefina - chef);
        }
	}
}
