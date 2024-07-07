import java.util.*;

class p1{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number of time u need: ");
        int n = sc.nextInt(), count = 1;
        if(n > 0){
            while (count++ <= n) {
                System.out.println("Rajnish");
            }
        }
        else{
            System.out.println("Give the number greater than 0...");
        }
    }
}