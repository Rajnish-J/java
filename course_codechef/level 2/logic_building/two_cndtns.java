import java.util.*;
//Task
// Write a program which does the following Accepts the count of test cases - t. Each test case has one integer N. 
// Output the following for each test case on separate lines
// * If input is exactly divisible by 3, output 'Divisible by 3'. Else output 'Not divisible by 3'.
// * If the input is odd, output 'Odd'. Else output 'Even'.
public class two_cndtns {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		int n = read.nextInt();
    		
    		// Condition 1
            if(n%3 == 0){
                System.out.println("Divisible by 3");
            }
            else{
                System.out.println("Not divisible by 3");
            }
            
            // Condition 2
            if(n%2 == 1){
                System.out.println("Odd");
            }
            else{
                System.out.println("Even");
            }
    		
		}
    }
}
