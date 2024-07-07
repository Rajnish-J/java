import java.util.*;

class p2{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int count = 1;

        if(n < 0){
            System.out.println("Enter the number greater than zero");
        }
        else{
            while (count <= n) {
                System.out.println(count);
                count++;
            }
        }
    }
}