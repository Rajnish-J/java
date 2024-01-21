import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        
        //The is the method we saw in last problem. Let us breakdown the structure of a method.

        // * access_modifier: Specifies the visibility of the method. It can be public, private, protected, or package-private (no modifier).
        // static means the method belong to the class and not a specific object of the class.

        // * return_type: Specifies the data type of the value that the method returns. If the method doesn't return anything, we use void.

        // * method_name: Name of the method (should be descriptive and follow Java naming conventions, e.g., camelCase).

        // * parameters: Inputs that the method accepts, enclosed in parentheses. Parameters include their data types and names. 
        //In this case int x has integer data type and

        // * Method body: The code block where the method performs its task. This is enclosed in curly braces {}.

        // * return: An optional statement used to return a value from the method. If the method has a return type other than void, 
        // you must use return to provide a value of that type.


        //Example adding and basic math formula using methods

        Scanner scanner = new Scanner(System.in);
        
        // Number of test cases
        int t = 3; 

        for (int i = 0; i < t; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            computeValue(A, B);
        }

        scanner.close();
    }

    // User-defined method to compute and print values
    public static void computeValue(int a, int b) {
        //complete the function
        int formula = ((a*a)+(2*a*b)+(b*b));
        int add = (a+b);
        System.out.println(formula);
        System.out.println(add);
    }
    
}
