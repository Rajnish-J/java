import java.util.*;

class a13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first_num = sc.nextInt(), second_num = sc.nextInt();

        if(first_num > second_num){
            System.out.println("Largest number is: " + first_num);
        }
        else if(first_num == second_num){
            System.out.println("Given both numbers are equal");
        }
        else{
            System.out.println("Largest number is: " + second_num);
        }
    }
}