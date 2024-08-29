import java.util.*;

class prime{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int fac_count = 2;

        for(int i = 2; i<Math.sqrt(num); i++){
            if(num % i == 0){
                fac_count++;
                if(fac_count > 2){
                    break;
                }
            }
        }
        System.out.println((fac_count > 2) ? "Not an Prime number" : "prime number");
    }
}