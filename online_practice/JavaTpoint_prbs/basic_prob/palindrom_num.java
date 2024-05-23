import java.util.*;
class palindrome {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        String res = palindrome_num(num);
        System.out.println(res);
    }

    public static String palindrome_num(int check){
        String flag = "Not a palindrome";
        int r, temp = check, sum = 0;

        while(check > 0){
            r = check % 10;
            sum = (sum * 10) + r; 
            check /= 10;
        }
        if(sum == temp){
            flag = "Palindrome";
            System.out.print("The given number " + temp + ", the reverse number is " + sum + ",therefore it is a ");
            return flag;
        }
        else{
            System.out.print("The given number " + temp + ", the reverse number is " + sum + ",therefore it is not a ");
            return flag;
        }
    }
}