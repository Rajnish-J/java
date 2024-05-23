// Precision Loss

// Many a time you try to convert a value of one type to another, only to find that your result was not quite what you were expecting. 
// This can happen when we try to convert a value from a type with a higher precision to a type with a lower precision. 
// When this happens, we can lose some of the information in the original value, resulting in a loss of precision.

// For example, let's say we have a double value of 3.14159265358979323846, and we want to convert it to a float, like so:

// double myDouble = 3.14159265358979323846;
// float myFloat = (float) myDouble;

// However, when we print out the value of myFloat, we get 3.1415927, which is not quite the same as the original value of myDouble. 
// This is because a float can only store a certain amount of precision, and some of the precision is lost during the conversion process.

// How do you avoid this?

// To avoid precision loss during type conversion, it's important to be aware of the precision of the types you're working with, and to choose your types carefully based on the needs of your program.

// double myDouble = 9223372036854775807.0;
// long myLong = (long) myDouble;
// System.out.println(myLong);
// This code will output 9223372036854775808, which is not the same as the original value of myDouble. 
// This is because the maximum value of a long is less than the maximum value of a double, so when we try to store the double as a long, we lose some of the precision.

// To avoid this problem, we can use the Math.round() method to round the double to the nearest long:

// double myDouble = 9223372036854775807.0;
// long myLong = Math.round(myDouble);
// System.out.println(myLong);
// This code will output 9223372036854775807, which is the closest long value to myDouble.

class roundoff
{
	public static void main (String[] args)
	{
		double myDouble1 = 3.14159265358979323846;
        float myFloat1 = (float) myDouble1;
        System.out.println(myFloat1);
        
        double myDouble2 = 9223372036854775807.0;
        long myLong2 = (long) myDouble2;
        System.out.println(myLong2);
        
        double myDouble3 = 9223372036854775807.0;
        long myLong3 = Math.round(myDouble3);
        System.out.println(myLong3);
	}
}