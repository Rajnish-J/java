import java.util.*;

class reverse_num{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int reverse_number = 0, remainder = 0;
        
        int res = numb(number, reverse_number, remainder);
        System.out.println(res);
    }

    public static int numb(int num_m, int rev, int rem){
        while(num_m != 0){
            rem = num_m % 10;
            rev = rev * 10 + rem;
            num_m /= 10;
        }
        return rev;
    } 
}