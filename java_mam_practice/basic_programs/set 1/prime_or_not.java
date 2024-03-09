import java.util.*;

class prime_or_not{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int flag = 0;

        if(num == 2){
            System.out.println("Prime number");
        }
        else if(num % 2 == 0 || num == 1){
            System.out.println("Not a prime number");
        }
        else{
            for(int i = 2; i * i<num; i++){
                if (num%1 == 0) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.println("Prime number");
            }
            else{
                System.out.println("Not a prime number");
            }
        }
    }
}