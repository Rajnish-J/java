/*
Description: https://www.hackerrank.com/challenges/java-int-to-string/problem?isFullScreen=true
 */

import java.util.Scanner;

class int_str_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = Integer.toString(num);
        
        if(str instanceof String){
            System.out.println("Good job");
            System.out.println(str);
        }
        else{
            System.out.println("Wrong answer");
        }
    }
}