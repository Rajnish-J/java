/*
Minimum number of coins
Chef has infinite coins in denominations of rupees 
5
5 and rupees 
10
10.

Find the minimum number of coins Chef needs, to pay exactly X rupees. I
f it is impossible to pay X rupees in denominations of rupees 5 and 10 only, print −1.

 */

import java.util.*;

class money{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int have = sc.nextInt();
            int have_10 = have / 10;
            int bal_10 = have % 10;
            int have_5 = bal_10 / 5;
            if(have % 10 == 0){
                System.out.println(have_10);
            }
            else if(have % 5 == 0){
                System.out.println(have_10 + have_5);
            }
            else{
                System.out.println(-1);
            }
        }
    }
}