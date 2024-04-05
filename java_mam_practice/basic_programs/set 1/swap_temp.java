import java.util.*;
class swap_temp{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        int first_number = sc.nextInt();
        int second_number = sc.nextInt();
        System.out.println("The two numbers before swapping " + first_number + " " + second_number);

        int temp = first_number;
        first_number = second_number;
        second_number = temp;

        System.out.println("The two numbers after swapping " + first_number + " " + second_number);

    }
}