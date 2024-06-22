import java.util.*;

class a15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        String res = "Smallest number is: ";

        if(a == b && c == a && b == c){
            System.out.println("All numbers are equal");
        }
        else if(a <= b){
            if(a < c){
                System.out.println(res+ a);
            }
            else{
                System.out.println(res + c);
            }
        }
        else if(b <= c){
            if(b < a){
                System.out.println(res + b);
            }
            else{
                System.out.println(res + a);
            }
        }
        else{
            System.out.println(res + c);
        }
    }
}