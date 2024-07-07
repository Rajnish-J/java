/*
Description: https://www.hackerrank.com/challenges/java-if-else/problem?isFullScreen=true
 */

import java.util.Scanner;

public class if_elsle_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        if( N % 2 != 0){
            System.out.println("Weird");
        }
        else{
            if (N > 1 && N < 6 || N > 20){
                System.out.println("Not Weird");
            }
            else{
                System.out.println("Weird");
            }   
        }
    }
}