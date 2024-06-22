package assignment;

import java.util.*;
class a6 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println(" 1.Java\n 2.python\n 3.SQL\n 4. Web tech\n 5. Advance java");
        System.out.print("Enter the number: ");
        int ip = sc.nextInt();
        if(ip == 1){
            System.out.println("Rajnish");
        }
        if(ip == 2){
            System.out.println("ponhareesh");
        }
        if(ip == 3){
            System.out.println("Ragavi");
        }
        if(ip == 4){
            System.out.println("Nandha");
        }
        if(ip == 5){
            System.out.println("sabari");
        }
        else{
            System.out.println("invalid number....");
        }
    }    
}
