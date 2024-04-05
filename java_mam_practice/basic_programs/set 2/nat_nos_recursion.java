// finding sum of natural numbers using recursion
import java.util.*;
class nat_no{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = calculate_nat(num);
        System.out.println(sum);
    }
    public static int calculate_nat(int n){
        if(n == 1){
            return 1;
        }
        else{
            return n + calculate_nat(n-1);
        }
    }
}