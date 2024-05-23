// It's the sale season again and Chef bought items worth a total of X rupees. The sale season offer is as follows:

// * if X≤100, no discount.
// * if 100<X≤1000, discount is 25 rupees.
// * if 1000<X≤5000, discount is 100 rupees.
// * if X>5000, discount is 500 rupees.

// Find the final amount Chef needs to pay for his shopping.

import java.util.*;

class sale{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int bill = sc.nextInt();
            System.out.println((bill<=100) ? bill : ((bill>100) && (bill<=1000)? bill-25 :  
            ((bill>1000) && (bill<=5000) ? bill-100 : (bill>5000) ? bill-500 : 0)));
        }
    }
}