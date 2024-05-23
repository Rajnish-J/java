//Java uses the Scanner class found in java.util package to get user input. You have to import the package to use the Scanner class.
import java.util.Scanner;

class user_input{
    public static void main(String[] args) {
        
        //To use the Scanner class, you have to create an object of the class and use any of the methods to read string, numbers etc.
        Scanner objName = new Scanner(System.in);

        //The method nextLine() is used to read a line of text from input and return it in string format.
        //The following line will read a string input from user.
        //We will also see how to read integers and other data types later on.
        System.out.print("\"Enter the name:");
        String varName = objName.nextLine();
        System.out.println(varName);
        System.out.println("-----------------------");


        //You have already seen how to read a String. Let's see how to read the other datatype values.
        // *nextInt(): Reads integer values.
        // *nextFloat(): Reads float value.
        // *nextDouble(): Reads double value.
        // *nextBoolean(): Reads boolean value.
        // *nextLine(): Reads string value until newline character ('\n') is encountered.
        // *next(): Reads string value until space or newline character is encountered.

        //Example: Accepting the integer value from user:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println(num);
        System.out.println("-----------------------");


        //performing basic arithmetic operation for the user by user inputs:
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the first number:");
		int a = read.nextInt();
        System.out.print("Enter the second number:");
		int b = read.nextInt();
		int sum = a + b;
		int diff = a - b;
		System.out.println("Sum is: " + sum);
		System.out.println("Difference is: " + diff);
        System.out.println("-----------------------");


        //performing string concatination from the user inputs:
        Scanner re = new Scanner(System.in);
        System.out.print("Enter your name: ");
		String x = re.nextLine();
		System.out.println("Hello " + x);
        System.out.println("-----------------------");
    }
}