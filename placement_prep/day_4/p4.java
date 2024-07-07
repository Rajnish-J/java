import java.util.*;

class p4{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int count = 2;

        if(n < 0){
            System.out.println("Enter the positive....");
        }
        else{
            while (count <= n) {
                System.out.println(count);
                count += 2;
            }
        }
    }
}