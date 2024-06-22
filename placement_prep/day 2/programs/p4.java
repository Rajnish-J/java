import java.util.*;

class p4{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if((num % 5 == 0) && (num % 10 == 0)){
            System.out.println("Testing");
        }
        else{
            System.out.println("Development");
        }
    }
}