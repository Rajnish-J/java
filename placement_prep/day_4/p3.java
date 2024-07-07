import java.util.*;

class p3{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int end = 1;

        if(n <0){
            System.out.println("Enter the postive number...");
        }
        else{
            while (n >= 1) {
                System.out.println(n);
                n--;
            }
        }
    }
}