// A problem setter is called an expert if at least 50% of their problems are approved by Chef.
// Munchy submitted X problems for approval. If Y problems out of those were approved, find whether Munchy is an expert or not.

import java.util.*;

class expert{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            float problems = sc.nextFloat();
            float verified = sc.nextFloat();

            System.out.println((verified/problems) >= 0.5 ? "YES" : "NO");
        }
    }
}