/*
Description: https://www.hackerrank.com/challenges/java-stdin-stdout/problem?isFullScreen=true
 */

import java.util.Scanner;

public class op_formatting_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i = 0; i<3; i++){
            String s1 = sc.next();
            int i1 = sc.nextInt();
            System.out.printf("%-15s%03d%n", s1, i1);
        }
        System.out.println("================================");
    }
}