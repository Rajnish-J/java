import java.util.Scanner;

class while_loop{
    public static void main(String[] args) {
        
        //Loops can execute a block of code as long as a specified condition is reached.
        //They are handy because they save time, reduce errors, and they make code more readable.
        //The while loop loops through a block of code as long as a specified condition is true:

        int a = 0;
		while(a < 7){
		    System.out.println(a); //prints the first six number...
		    a++;
            System.out.println("----------------------");
        }


        //Getting the number from user and prints the number as the user gives, using scanner funcion...

        Scanner read = new Scanner(System.in);
		int num = read.nextInt();
		int b = 0;
		// Update your code below this line
		while(b < num){
		    System.out.println(b);
		    a++;
            System.out.println("----------------------");
		}


        //The do/while loop is a type of while loop.
        //This loop will execute the code block once, before checking if the condition is true, 
        //then it will repeat the loop as long as the condition is true.

        int i = 0;
		do{
		    System.out.println(i);
		    i++;
		}
		while(i < 6);
    }
}