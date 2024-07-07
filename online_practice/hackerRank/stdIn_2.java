/*
Description: https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem?isFullScreen=true
 */

import java.util.Scanner;

class stdIn_2{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int myInt_1 = sc.nextInt();
        int myInt_2 = sc.nextInt();
        int myInt_3 = sc.nextInt();
        
        System.out.println(myInt_1);
        System.out.println(myInt_2);
        System.out.println(myInt_3);
    }
}