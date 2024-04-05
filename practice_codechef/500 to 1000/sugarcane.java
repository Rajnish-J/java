// While Alice was drinking sugarcane juice, she started wondering about the following facts:

// * The juicer sells each glass of sugarcane juice for 50 coins.
// * He spends 20% of his total income on buying sugarcane.
// * He spends 20% of his total income on buying salt and mint leaves.
// He spends 30% of his total income on shop rent.

// Alice wonders, what is the juicer's profit (in coins) when he sells N glasses of sugarcane juice?

import java.util.*;

class sugarcane{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long price = 50;

            long sold = sc.nextInt();
            long cost = price * sold;

            System.out.println(cost -  (((cost * 70)/100)));
        }
    }
}