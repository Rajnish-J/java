/*
Description: https://www.hackerrank.com/challenges/java-stdin-stdout/problem?isFullScreen=true
 */
import java.util.Scanner;

public class stdIn2_4 {
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     
     //user - input
     int num = sc.nextInt();
     double num_1 = sc.nextDouble();
     sc.nextLine();
     String str = sc.nextLine();
     
     // printing statements
     System.out.println("String: "  + str);
     System.out.println("Double: " + num_1);
     System.out.println("Int: " + num);
    }

}