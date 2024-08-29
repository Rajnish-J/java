import java.util.*;

class p5{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the first angle: ");
        int a = sc.nextInt();
        System.out.print("Enter the first angle: ");
        int b = sc.nextInt();
        System.out.print("Enter the first angle: ");
        int c = sc.nextInt();

        if(a+b+c == 180){
            System.out.println("Yes, Traingle");
        }
        else{
            System.out.println("Not a traingle");
        }
    }
}