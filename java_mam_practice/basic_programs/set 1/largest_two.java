import java.util.*;
class largest_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int num;

        if(a > b){
            System.out.println(a + " is the largest number");
        }
        else{
            System.out.println(b + " is the largest number");
        }

        // using ternary operator
        num = (a>b? a : b);
        System.out.println(num);
    }
    
}
