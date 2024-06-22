import java.util.*;

class p2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if(num == 0){
            System.out.println("Zero");
        }
        else if(num>0){
            System.out.println("Positive number");
        }
        else{
            System.out.println("Negative");
        }
    }
}
