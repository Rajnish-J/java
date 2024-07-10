import java.util.*;

public class String_palindrome {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the String: ");
        String ip = sc.next();
        String rev = " ";
        for(int i = ip.length()-1; i>=0; i--){
            rev += ip.charAt(i);
        }
        if(ip == rev){
            System.out.println(rev + ": Palindrome");
        }
        else{
            System.out.println(rev + ": Not an palindrome");
        }
    }
}
