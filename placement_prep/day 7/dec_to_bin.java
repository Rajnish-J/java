import java.util.*;

class dec_to_bin{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Ente the number: ");
        int num = sc.nextInt();
        int sum = 0;
        //int temp = num;
        int pow = 1;

        while (num>0) {
            sum += num%2 * pow;
            num /= 2;
            pow *= 10;
        }
        System.out.println(sum);
    }
}