import java.util.Scanner;

class testcases{
    public static void main(String[] args) {
        
        //Test cases are multiple Inputs - multiple instances of the same problem, all of which have to be solved by your code correctly.

        Scanner read = new Scanner(System.in);
        
        //without the testcase concept, we need extra 5 lines of code to collect information form the user...
        String A = read.next();
        String B = read.next();
        String C = read.next();
        String D = read.next();
        String E = read.next();
        // You can use "\n" to add a new line instead of adding multiple print statements
        System.out.print(A + "\n" + B + "\n" + C + "\n" + D + "\n" + E );


        //In the previous problem - we wrote the program to accept 5 inputs on 5 separate lines.

        //What will we do if we expect 100 inputs or test cases?
        //What about 100,000 inputs or test cases?
        //To overcome this we use testcases, here is an example:

        Scanner sc = new Scanner(System.in);
        // accept the count of test cases given in the 1st line
        int t = sc.nextInt();
        
        // Run a loop to accept 't' inputs
        for(int i=0; i<t; i++)
        {
            // accept an integer N in each test case
            int n = sc.nextInt();
            // output the number mirror for each test case
            // "println" prints output followed with a new line.
            System.out.println(n);
        }
    }
}