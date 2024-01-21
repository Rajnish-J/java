// Uttu broke his phone. He can get it repaired by spending X rupees or he can buy a new phone by spending Y rupees. 
// Uttu wants to spend as little money as possible. Find out if it is better to get the phone repaired or to buy a new phone.

import java.util.*;

class broken
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int repair = sc.nextInt();
		    int neew = sc.nextInt();
		    
		    System.out.println((repair > neew) ? "NEW PHONE" : (repair == neew) ? "ANY" : "REPAIR");
		}

	}
}
