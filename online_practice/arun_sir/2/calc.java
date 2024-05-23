import java.util.*;
class calc
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        char operation='*' ;
        int num1 = sc.nextInt() , num2 = sc.nextInt();
        switch(operation)
        {
            case '+':
                int add=num1+num2;
             	System.out.println("Sum of two numbers is "+add);
             	break;
   
            case '-':
                int sub=num1- num2;
             	System.out.println("Sub of two numbers is "+sub);
             	break;

            case '*':
                int mul=num1*num2;
             	System.out.println("Prod of two numbers is "+mul);
             	break;

            case '/':
                int div=num1/num2;
             	System.out.println("Div of two numbers is "+div);
             	break;

            default:
                System.out.println("Enter any one of the following operator : +, -, *, /");
        }
     }
}
