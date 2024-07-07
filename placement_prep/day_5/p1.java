import java.util.*;

class p1{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if(num <=0){
            System.out.println("Enter the number greater than zero...");
        }
        else{
            for(int i = num; i>0; i--){
                System.out.print(i + " ");
            }
        }
    }
}