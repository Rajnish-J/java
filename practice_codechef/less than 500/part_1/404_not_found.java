// Chef's website has a specific response mechanism based on the HTTP status code received:

// If the response code is 404, the website will return NOT FOUND.
// For any other response code different from 404, the website will return FOUND.
// Given the response code as X, determine the website response.

import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		if(num == 404){
		    System.out.println(" NOT FOUND");
		}
		else{
		    System.out.println("FOUND");
		}

	}
}
