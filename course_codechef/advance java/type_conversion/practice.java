// Practice - Type conversion

// Write a program to do the following

// Read a double value from the user.
// Convert the double value to an integer value using explicit type conversion.

/*
question
 * import java.util.*;

class practice
{
	public static void main (String[] args)
	{
	    Scanner read = new Scanner(System.in);
		double num1 = read.________();
        int num2 = ________;
        System.out.println("The integer value is: " + num2);
	}
}
-----------------------------------------------------------------------------------------------------------------------------------
 */


 import java.util.*;

 class practice
 {
     public static void main (String[] args)
     {
         Scanner read = new Scanner(System.in);
         double num1 = read.nextDouble();
         int num2 = (int)num1;
         System.out.println("The integer value is: " + num2);
     }
 }