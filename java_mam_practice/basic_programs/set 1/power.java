import java.util.*;
public class power {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();
        int pow = 1;

        for(int i = 0; i<power; i++){
            pow *= base;
        }
        System.out.println(pow);
    }
}
