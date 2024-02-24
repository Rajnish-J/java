/*
Decrement OR Increment
Write a program to obtain a number N and increment its value by 1 if the number is divisible by 4 otherwise decrement its value by 1.
 */

import java.util.*;

class dec_or_inc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 4 == 0){
            num++;
            System.out.println(num);
        }
        else{
            num--;
            System.out.println(num);
        }
    }
}