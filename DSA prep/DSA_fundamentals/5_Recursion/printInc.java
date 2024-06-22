import java.util.*;

class printInc{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        print(num);
    }

    static void print(int n){
        if(n == 0){
            return;
        }

        print(n-1);
        System.out.print(n + " ");
    }
}   