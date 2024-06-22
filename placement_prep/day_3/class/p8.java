import java.util.*;

class p8{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the positive number: ");
        int num = sc.nextInt();
        int count = 0;

        if(num < 0){
            System.out.println("Enter the positive number");
        }
        else{
            while(num > 0){
                count++;
                num /= 10;
            }
            System.out.println(count);
        }
    }
}