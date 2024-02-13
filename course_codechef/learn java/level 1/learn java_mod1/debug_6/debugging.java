import java.util.Scanner;

class debug{
    public static void main(String[] args) {
        //This is a good time to learn the basics of Debugging - Debugging is finding and fixing errors or bugs in the source code.

        //What is a bug now?
        //A bug is an error that causes our program to generate an unexpected output that is different from our expected output or no output. 
        //What are some of the error codes you saw so far?

        // *CE - Compilation error / Syntax error
        // *RE - Run-time error
        // *WA - Wrong answer / Logical error
        // *TLE - Time limit exceeded

        //Why is debugging necessary?
        //To become good at coding, one must be a great debugger because it is the art of finding the errors inside a code, 
        //and one who can find and understand errors can only solve them.
        System.out.println("------------------------------");

        //Let us start with a Syntax error - We write code in any particular language and each language has its grammar, 
        //so any kind of grammatical mistakes come under syntax error.

        //Ex - in English when we complete a sentence we use a full stop (.)
        //Similarly, when we complete a line in Java we use a semicolon(;)

        //The following is an example of a syntax error - can you find out why?

        int Number = 19;
        System.out.println(Number);
        // In this program, semicolon is missing in the print statement...
        System.out.println("------------------------------");


        //How do you identify the 'Compilation error'?

        //When you click on Run - you will get the error description below it.
        // For example - in the example below - we are being told by the system that there is an error on Line 7.
        //The nature of the error is that a ; was expected.

        //Status :Compilation error
        //corrected code:

        int a = 3; // changed capital I to small i
        int b = 5;
        System.out.println(a * b); //added semicolon
        System.out.println("------------------------------");



        //There should be one closing bracket for each opening bracket and the closing bracket should also be of the same type, like (),{},[]
        //If we try to use different opening and closing brackets, it can give you a syntax error.
        
        int n;
        n = 5;
        if (n % 2 == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }     // corrected the closing bracket
        System.out.println("------------------------------");



        //Runtime Error: Generally caused by accessing a negative or unreachable index of a string or an array or dividing a number by 0.
        //first checking the variable for non-zero number...

        int y, z;
        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();
        z = sc.nextInt();
        
        if ((b != 0) || (a != 0)  ) {
            System.out.println("Infinity");
            return;
        }
        System.out.println(a / b);
        System.out.println("------------------------------");


        //Runtime Error: Generally caused by accessing a negative or unreachable index of a string or an array or dividing a number by 0.
        System.out.println("------------------------------");

        //A logical error is an error in a program that occurs when the code compiles and runs without producing any error messages, 
        //but it does not produce the expected or desired output.
        //Instead, it performs a different computation or provides incorrect results due to a flaw in the algorithm or logic of the program. 
        //Logical errors are the hardest to find in a program.
        //One should need to be highly skilled to quickly figure out their logical errors.

        //They can be categorized into different types:

        // * Incorrect Conditions
        // *  Incorrect Index
        // * Incorrect variable usage
    }
}
