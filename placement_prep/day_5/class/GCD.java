import java.util.*;

class GCD{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the first number: ");
        int num_1= sc.nextInt();
        System.out.print("Enter the second number: ");
        int num_2 = sc.nextInt();
        int gcd = 0;

        int small = (num_1 > num_2 ? num_2 : num_1);

        for(int i = 2; i<=small; i++){
            if((num_1 % i ==0) && (num_2 % i ==0)){
                gcd = i;
            }
        }
        System.out.println("GCD: " + gcd);
    }
}