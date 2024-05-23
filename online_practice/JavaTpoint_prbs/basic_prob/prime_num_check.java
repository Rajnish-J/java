import java.util.*;

class prime{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number to check: ");
        int check_num = sc.nextInt();
        
        String res = prime_check(check_num);
        System.out.println(res);
    }
    
    public static String prime_check(int num) {
    String flag = "Prime number"; 
    
    if (num == 2) {
        return flag;
    } 
    else if (num % 2 == 0 || num == 1) {
        flag = "Not a prime number";
    } 
    else {
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                flag = "Not a prime number";
                break;
            }
        }
    }
    return flag;
    }
}