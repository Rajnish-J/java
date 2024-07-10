/*
Description: https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true
 */

import java.util.Scanner;

class static_initilizer_10 {
    static Scanner sc = new Scanner(System.in);
    static int B;
    static int H;
    static boolean flag = true;
    
    static{
        B = sc.nextInt();
        H = sc.nextInt();
        
        if((B <= 0) || (H <= 0)){
            flag = false;
            System.out.print("java.lang.Exception: Breadth and height must be positive");
        }
        
    }
    public static void main(String[] args) {
        if(flag){
            System.out.print(B*H);
        }
    }   
}