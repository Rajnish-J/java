import java.util.*;

class sys_pow_num{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if(!(count_check(num)) && num > 0){
            System.out.println("Non Systematic power number");
        }
        else{
            
            int n_1 = secondPart(num);
            int n_2 = firstPart(num);
            
        }
    }

    public static boolean count_check(int num){
        int count = 0;
        while(num>0){
            count++;
            num/=10;
        }
        if(count % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static int count(int num){
        int count = 0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }

    public static int reverse(int num){
        int rev = 0;
        while(num != 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        return rev;
    }

    public static int secondPart(int num){
        int n1, n2 = 0;
        // !finding the second part
        int pow = 1;
        int run = count(num)/2; 
        while (run > 0) {
            int last = num%10;
            n2 = n2 + (last)*pow;
            num/=10;
            pow *= 10;
            run --;
            }
        return n2;
    }
    
    public static int firstPart(int num){
        int n1 = 0, n2 = 0;
        int pow = 1;
        int run = count(num)/2;
        // ! finding first part
        int rev = reverse(num);
        while (run > 0) {
            int first = num%10;
            n2 = n2 + (first)*pow;
            num/=10;
            pow *= 10;
            run --;
        }
        return n1;
    }
}