// leap year

import java.util.*;

class p7{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the year: ");
        int yr = sc.nextInt();

        if((yr % 4 == 0 && yr % 100 != 0) || (yr % 400 == 0)){
            System.out.println("leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}