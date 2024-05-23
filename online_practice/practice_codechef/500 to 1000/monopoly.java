// There are 4 companies in the markets of Chefland, A, B, C, and D.
// This year, 
// * Company A made a profit of P lakh rupees,
// * Company B made a profit of Q lakh rupees,
// * Company C made a profit of R lakh rupees,
// Company D made a profit of S lakh rupees.

// There is said to be a monopoly in the market if the profit made by one company is.
//  strictly greater than the sum of profits made by all other companies.

// Determine if there is a monopoly in the market or not.

import java.util.*;

class monopoly{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();

            System.out.println(((A + B + C < D) || (A + B + D < C) || (A + C + D < B) || (B + C + D < A) ? "YES" : "NO"));
        }
    }
}