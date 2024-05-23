// try-catch-finally
// Java has some special keywords that can help us handle exceptions. These keywords are: try, catch, and finally.

// * The "try" keyword is used to enclose a block of code that might throw an exception.
// * The "catch" keyword is used to catch the exception and handle it in a specific way.
// * And finally, the "finally" keyword is used to execute code whether or not an exception was thrown.

import java.util.*;

class Checked
{
	public static void main (String[] args)
	{
        try {
            // Attempt a risky operation
            int num1 = 10;
            int num2 = 0;
            int result = num1 / num2;
            System.out.println(result);
        }
        
        catch (ArithmeticException e) {
            // Catch the exception and handle it
            System.out.println("Oops, an error occurred: " + e.getMessage());
        
        } 
        
        finally {
            // Execute code whether or not an exception was thrown
            System.out.println("This code will always execute!");
        }
	}
}