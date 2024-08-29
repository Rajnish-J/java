import java.util.*;

class bin_to_dec {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the binary number: ");
        long bin = sc.nextLong();
        int sum = 0, pow = 1;

        while (bin > 0) {
            sum += (bin % 10) * pow;
            pow *= 2;
            bin /= 10; 
        }
        System.out.println(sum);
    }
}