// Custom Exceptions

// Let's say you're writing a program that calculates the area of a rectangle. You might have a method that takes in the length and width of the rectangle and returns the area. 
// But what happens if someone passes in a negative value for the length or width? Your program won't be able to calculate the area because it doesn't make sense to have a negative length or width.

// This is where custom exceptions come in. Instead of using the built-in exceptions provided by Java, you can create your own exceptions that are specific to your program. 
// In this case, you could create a custom exception called NegativeValueException that gets thrown whenever someone passes in a negative value for the length or width.

import java.util.*;

class Rectangle {
    public static int calculateArea(int length, int width) throws NegativeValueException {
        if (length < 0 || width < 0) {
            throw new NegativeValueException("Error: length or width cannot be negative");
        }
        return length * width;
    }
}

class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}

class area
{
	public static void main (String[] args)
	{
		try {
            int length = -5;
            int width = 3;

            Rectangle rect = new Rectangle();
            int area = rect.calculateArea(length, width);
            System.out.println("Area: " + area);
        }
        catch (NegativeValueException e) {
            System.out.println(e.getMessage());
        }
	}
}