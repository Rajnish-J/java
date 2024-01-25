import java.util.*;
class greatest_of_three_nos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first_num = sc.nextInt();
        int second_num = sc.nextInt();
        int third_num = sc.nextInt();

        if((first_num == second_num) && (first_num == third_num)){
            System.out.println("All numbers are equal");
        }
        else if((first_num >= second_num) && (first_num >= third_num)){
            if(first_num == second_num){
                System.out.println(first_num + " and second number are greater");
            }
            else if(first_num == third_num){
                System.out.println(first_num + " and third number are greater");
            }
            else{
            System.out.println(first_num + " is the greatest number");
            }
        }
        else if((second_num >= first_num) && (second_num >= third_num)){
            if(second_num == third_num){
                System.out.println(second_num + " and third number are greater");
            }
            else{
                System.out.println(second_num + " is the greatest number");
            }
        }
        else{
            System.out.println(third_num + " is the greatest number");
        }
    }
}