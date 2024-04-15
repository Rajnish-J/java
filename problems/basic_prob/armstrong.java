import java.util.*;

class armstrong_find{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        int num = sc.nextInt(), original_number = num, remainder = 0, result = 0;

        original_number = num;
        int length_res = digit(original_number);
        original_number = num;
        String res = armstrong_num(num, original_number, remainder, result, length_res);
        System.out.println(res);
    }

    // finding no.of.digits in given number
    public static int digit(int length){
        int num_of_digits = 0;
        while(length > 0 ){
            length /= 10;
            num_of_digits++;
        }
        return num_of_digits;
    }

    // checking for armstrong number using no.of.digits
    public static String armstrong_num(int num, int orig_num, int rem, int res, int powe){
        while(orig_num > 0 ){
            rem = orig_num % 10;
            res += Math.pow(rem,powe);
            orig_num /= 10;
        }
        String final_res = (res == num ? "Armstrong Number" : "Not an armstrong number");
        return final_res;
    }
}