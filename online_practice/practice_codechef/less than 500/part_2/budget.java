// Akshat has X rupees to spend in the current month. His daily expenditure is Y rupees, i.e., he spends Y rupees each day.
// Given that the current month has 30 days, find out if Akshat has enough money to meet his daily expenditures for this month.

import java.util.*;

class budget
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int salary = sc.nextInt();
		    int expenditure = sc.nextInt();
		    
		    int month_end = 30 * expenditure;
		    System.out.println((salary >= month_end) ? "YES" : "NO");
		}

	}
}
