import java.util.*;

class a12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if((num % 4 == 0) && (num % 6 == 0)){
            System.out.println("Rajnish");
        }
        else{
            System.out.println("Java");
        }
    }
}