// Given an Integer N, write a program to reverse it.

import java.util.*;

class reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int num = sc.nextInt();
            int reversed = 0;
            while(num>0){
                int rem = num % 10;
                reversed = (reversed * 10) + rem;
                num = num / 10;
                
            }
            System.out.print(reversed);
            System.out.println();
        }
    }
}