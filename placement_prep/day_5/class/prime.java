import java.util.*;

class prime{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number to check the number is prime or not: ");
        int num = sc.nextInt();

        String res = " ";
        if(num <= 1){
            res = "Not a prime number:";
        }
        else{
            for(int i = 2; i<=Math.sqrt(num); i++){
                if(num % i == 0){
                    res = "Not a prime number";
                }
                else{
                    res = "Prime number";
                }
            }
        }
        System.out.println(res);
    }
}