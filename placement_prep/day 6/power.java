import java.util.*;

class power{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the value of X: ");
        int x = sc.nextInt();
        System.out.print("Enter the power number: ");
        int pow = sc.nextInt();

        int res = 1;
        for(int i = 1; i<=pow; i++){
            res *= x;
        }
        System.out.println(res);
    }
}