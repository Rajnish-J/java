// Chef rented a car for a day. Usually, the cost of the car is Rs 10 per km. 
// However, since Chef has booked the car for the whole day, he needs to pay for at least 300 kms even if the car runs less than 300 kms.

// If the car ran X kms, determine the cost Chef needs to pay.

import java.util.*;

class car_trip
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int distance = sc.nextInt();
		    if((distance<=300)){
		        System.out.println(3000);
		    }
		    if(distance > 300){
		        System.out.println(distance * 10);
		    }
		}

	}
}
