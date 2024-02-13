import java.util.Scanner;

class conditional_stmts{
    public static void main(String[] args) {
        
        //if and else can be used together to create conditions.
        //It returns 1 if the condition is true and 0 if the condition is false.
        //There are multiple operators which can be used in conditional statements.

            //Equal to '=='
            //Not Equal '!='
            //Greater than '>'
            //Less than '<'
            //Greater than or equal to '>='
            //Less than or equal to '<='
        //Example: conditional statements using rational operators:

        int Age = 25;
        int Vage = 18;

        if (Age > Vage) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }
        System.out.println("---------------------------------------");


        //An "if statement" is written by using the 'if' keyword.
        //Example:

        Scanner read = new Scanner(System.in);
        System.out.print("Enter the first number: ");
		int a = read.nextInt();
        System.out.print("Enter the second number: ");
		int a1 = read.nextInt();
		if (a > a1){
		    System.out.println("Coding is Fun!");
		}
        System.out.println("---------------------------------------");


        //The 'else if' keyword means "if the previous conditions were not true, then try this condition"
        //Example: two conditions with same situation but the values are different, check the respective values...

        int b = 23;
        int r = 45;
        if(r > b){
            System.out.println("Rob scored higher marks than Bob.");
        }
        else if(r == b){
            System.out.println("Bob & Rob both scored the same");
        }
        
        b = 15;
        r = 15;
        if(r > b){
            System.out.println("Rob scored higher marks than Bob.");
        }
        else if(r == b){
            System.out.println("Bob & Rob both scored the same");
        }
        System.out.println("---------------------------------------");

        //The 'else' keyword includes anything which isn't included in the previous conditions.
        //Example: using else condition...

        int j;
        int k;
        j = 24;
        k = 32;
        if (j > k) {
            System.out.println("Ram is heavier than Karan.");
        } else if (j < k) {
            System.out.println("Karan is heavier than Ram");
        } else {
            System.out.println("Ram & Karan have the same weight!");
        }

        j = 78;
        k = 78;
        if (j > k) {
            System.out.println("Ram is heavier than Karan.");
        } else if (j < k) {
            System.out.println("Karan is heavier than Ram");
        } else {
            System.out.println("Ram & Karan have the same weight!");
        }
        System.out.println("---------------------------------------");
    }
}