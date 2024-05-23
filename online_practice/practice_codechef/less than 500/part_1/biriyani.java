// According to a recent survey, Biryani is the most ordered food. 
// Chef wants to learn how to make world-class Biryani from a MasterChef. 
// Chef will be required to attend the MasterChef's classes for X weeks, and the cost of classes per week is Y coins. 
// What is the total amount of money that Chef will have to pay?

import java.util.*;

class biriyani
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int weeks = sc.nextInt();
		    int days = sc.nextInt();
		    int to_pay;
		    
		    to_pay = weeks * days;
		    System.out.println(to_pay);
		}
    }
}
