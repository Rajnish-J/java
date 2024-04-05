import java.util.*;

class gcd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num_2 = sc.nextInt();
        int smallest = Math.min(num_1, num_2);
        int gcd = 1;

        //loop
        for(int i = 0; i<smallest; i++){
            if((num_1%1 == 0) && (num_2 % i == 0)){
                gcd = i;
            }
        }
        System.out.println("The GCD of given two numbers are: " + gcd);
    }
}