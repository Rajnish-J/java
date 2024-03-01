import java.util.*;

class reverseNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int reverseNumber = 0;

        while(num != 0){
            int digit = num % 10;
            reverseNumber = reverseNumber * 10 + digit;
            num /= 10;
        }
        System.out.println(reverseNumber);
    }
}