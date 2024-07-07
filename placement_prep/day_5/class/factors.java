import java.util.*;

class factor{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number to check: ");
        int num = sc.nextInt();

        for(int i = 1; i<=num; i++){
            if(num % i ==0){
                System.out.print(i + " ");
            }
        }
    }
}