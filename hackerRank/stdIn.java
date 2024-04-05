/*
Most HackerRank challenges require you to read input from stdin (standard input) and write output to stdout (standard output).

One popular way to read input from stdin is by using the Scanner class and specifying the Input Stream as System.in. For example:

Scanner scanner = new Scanner(System.in);
String myString = scanner.next();
int myInt = scanner.nextInt();
scanner.close();

System.out.println("myString is: " + myString);
System.out.println("myInt is: " + myInt);
The code above creates a Scanner object named  and uses it to read a String and an int. 
It then closes the Scanner object because there is no more input to read, and prints to stdout using System.out.println(String). 
So, if our input is:

Hi 5
Our code will print:

myString is: Hi
myInt is: 5

Task
In this challenge, you must read  integers from stdin and then print them to stdout. 
Each integer must be printed on a new line. To make the problem a little easier, a portion of the code is provided for you in the editor below.
 */

package hackerRank;

import java.util.Scanner;

class stdIn{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int myInt_1 = sc.nextInt();
        int myInt_2 = sc.nextInt();
        int myInt_3 = sc.nextInt();
        
        System.out.println(myInt_1);
        System.out.println(myInt_2);
        System.out.println(myInt_3);
    }
}