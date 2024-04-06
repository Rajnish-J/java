package problems.basic_prob;
import java.util.*;

class fibo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of fibonacci series: ");
        int num = sc.nextInt() - 2;

        System.out.print("Enter the number to start fibonacci series: ");
        int first_term = sc.nextInt();
        int second_term = first_term + 1;
        int next_term = 0;
        System.out.print(first_term);
        System.out.print(" " + second_term + " ");
        while(num-- > 0){
            next_term = first_term + second_term;
            System.out.print(next_term + " ");
            first_term = second_term;
            second_term = next_term;
        }
    }
}