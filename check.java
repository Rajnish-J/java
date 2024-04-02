import java.util.Scanner;

class age{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception{
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        Thread.sleep(2000);
        System.out.println("The age of the person is: " + age);
    } 
}
/*
output:
Enter the age: 18
The age of the person is: 18
 */