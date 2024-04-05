/*
Chef has fallen in love with Cheffina, and wants to buy N gifts for her. On reaching the gift shop, Chef got to know the following two things:
The cost of each gift is 1 coin.
On the purchase of every 4th gift, Chef gets the 5th gift free of cost.
What is the minimum number of coins that Chef will require in order to come out of the shop carrying N gifts?
 */

import java.util.*;

class presents{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int gift = sc.nextInt();
            int coins = (gift/5) * 4 + (gift%5);
            System.out.println(coins);

        }
    }
}