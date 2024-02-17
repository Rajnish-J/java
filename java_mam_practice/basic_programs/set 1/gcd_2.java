import java.util.*;
class gcd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_1 = sc.nextInt();
        int num_2 = sc.nextInt();
        int small = Math.min(num_1, num_2);
        int gcd = 1;

        for(int i = small; i>=1; i--){
            if((num_1%i == 0)&&(num_2%i == 0)){
                gcd = i;
                break;
            }
        }
        System.out.println("The GCD of the numbers are " + gcd);
    }
}

