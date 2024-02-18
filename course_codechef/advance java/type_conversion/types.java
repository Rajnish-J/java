// Types of type conversion

// In Java, there are two types of type conversion -

// * Implicit(Widening Casting) - converting a smaller type to a larger type size
// * Explicit(Narrowing Casting) - converting a larger type to a smaller size type

// Implicit type conversion, also known as automatic type conversion, occurs when the data type of a value is automatically converted to another data type by the Java compiler. 
// This happens when the value needs to be stored in a larger data type than its original data type. 
// For example, if we assign an integer value to a double variable, the integer value will be automatically converted to a double value. Here's an example of implicit type conversion in action:

// int myInt = 5;
// double myDouble = myInt;

// In this code, we assign the integer value 5 to the variable myInt. Then, we assign myInt to the variable myDouble, which is of type double. 
// Since double is a larger data type than int, the value is automatically converted to a double.

// The second type of type conversion is explicit type conversion, also known as type casting. This occurs when we manually convert a value from one data type to another data type. 
// This is necessary when you want to store a value in a variable of a different data type. We do this by using parentheses and specifying the new data type before the value we want to convert.

// Here's an example of explicit type conversion in action:

// double myDouble = 5.7;
// int myInt = (int) myDouble;

// In this code, we assign the double value 5.7 to the variable myDouble. Then, we convert myDouble to an integer value and assign it to the variable myInt. 
// We do this by using parentheses and specifying the data type we want to convert to before the value we want to convert.

class pliter
{
	public static void main (String[] args)
	{
		int myImplicitInt = 5;
        double myImplicitDouble = myImplicitInt;
        
        double mExplicitDouble = 5.7;
        int myExplicitInt = (int) mExplicitDouble;
        
        System.out.println(myImplicitDouble);
        System.out.println(mExplicitDouble);
	}
}