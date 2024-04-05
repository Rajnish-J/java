// Chef classifies a day to be either rainy, cloudy, or clear.

// In a particular week, Chef finds X days to be rainy and Y days to be cloudy.
// Find the number of clear days in the week.

import java.util.*;

class clear
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int rainy = sc.nextInt();
		int cloudy = sc.nextInt();
		int clear;
		int days = 7;
		clear = (days-rainy) - cloudy;
		System.out.println(clear);
	}
}
