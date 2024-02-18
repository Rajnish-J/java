// What is Type Conversion

//Type conversion is simply the process of converting data of one data type into another. It is like transforming a chameleon into different colors. 
// Just as chameleons need different colors for different environments, Java needs different data types for different operations.

// But why do we need Type Conversion? Think of it like this: you wouldn't try to put a square peg in a round hole, right? In the same way, Java needs the right data type to fit into the right operation.

// Here's an example of code that works without Type Conversion:
// int num = 5;
// double result = num / 2;
// System.out.println(result);
// The output of this code would be 2 because in Java, when you divide an integer by another integer, the result is also an integer.

// Now let's use Type Conversion to get the correct answer:
// int num = 5;
// double result = (double) num / 2;
// System.out.println(result);

// By adding "(double)" before the variable "num", we are telling Java to convert the integer to a double before dividing by 2. The output of this code would be 2.5, which is the correct answer.

class typer
{
	public static void main (String[] args)
	{
        int num = 5;
        System.out.println("Before type conversion: " + num / 2);
        System.out.println("After type conversion: " + (double) num / 2);
	}
}