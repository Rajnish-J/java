import java.util.*;

class fibo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of fibonacci series: ");
        int num = sc.nextInt();
        int next_term = 0;
        int first_term = 0;
        int second_term = 1;
        while(num-- > 0){
            next_term = first_term + second_term;
            System.out.print(next_term + " ");
            first_term = second_term;
            second_term = next_term;
        }
    }
}