import java.util.*;

class num_palindrome
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int res = 0;
        int temp = num;

        while (num > 0)
        {
            res =+ (res * 10) + (num %10);
            num /= 10;
        }
        System.out.println((res == temp) ? "Palindrome number" : "Non an palindrome number");
    }
}