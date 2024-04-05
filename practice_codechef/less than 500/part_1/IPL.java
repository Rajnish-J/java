// DAIICT college students want to attend an IPL match.
//A total of N students from the college want to go while only M tickets are available for the match.

//Determine how many students won't be able to book tickets.

import java.util.*;

class ipl
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0){
		    
		    int students = sc.nextInt();
		    int need = sc.nextInt();
		    int buy;
		    if(students>need){
		        buy = students - need;
		    }
		    else{
		        buy = 0;
		    }
		    
		    System.out.println(buy);
		    
		}

	}
}
