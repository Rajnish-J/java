// Valentine is Coming

// Valentine's Day is approaching and thus Chef wants to buy some chocolates for someone special.
// Chef has a total of X rupees and one chocolate costs Y rupees. What is the maximum number of chocolates Chef can buy?

import java.util.*;

class chocolate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int have = sc.nextInt();
            int prize = sc.nextInt();
    
            if(have<prize){
                System.out.println(0);
            }
            else{
                System.out.println(have / prize);
            }
        }
    }
}   