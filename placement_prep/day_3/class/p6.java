import java.util.*;

class p6{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number of days you returned the book late: ");
        int day = sc.nextInt();
        double fine = 0d;

        if(day >=1 && day <=5){
            fine = day * 0.50d;
        }
        else if(day >= 6 && day <= 10){
            fine = day * 1.0d;
        }
        else if(day > 10 && day <= 29){
            fine = day * 5.0d;
        }
        else if(day > 30){
            fine = day * 5.0d;
            System.out.println();
        }
        System.out.println(day > 30 ? "Sorry, your membership is cancelled, Get Lost..." + fine : "Your fine is: " + fine);
    }
}