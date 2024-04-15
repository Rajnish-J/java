import java.util.*;

class factorial_find{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        int num  = sc.nextInt();
        if(num < 0){
            num = - num;  
        }
        System.out.println("The factorial of given number " + num + ", is: " + factorial(num));
    }

    public static int factorial(int in){
        int fact = 1;
        for(int i = 1; i<= in; i++){
            fact *= i;
        }
        return fact;
    }
}