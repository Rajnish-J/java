import java.util.*;
class armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original_number, remainder, result = 0;
        int num_of_digits = 0;

        original_number = num;

        while(original_number > 0 ){
            original_number /= 10;
            num_of_digits++;
            remainder = original_number % 10;
            result += Math.pow(remainder,num_of_digits);
            original_number /= 10;
        }
            

        System.out.println((result == num)? "Armstrong Number" : "Not a Armstrong Number");

    }
}