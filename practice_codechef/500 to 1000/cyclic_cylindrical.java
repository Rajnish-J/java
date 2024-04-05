/*
Cyclic Quadrilateral
Read problem statements in Mandarin Chinese, Russian, and Vietnamese as well.
You are given the sizes of angles of a simple quadrilateral (in degrees) A, B, C and D, in some order along its perimeter. Determine whether the quadrilateral is cyclic.

Note: A quadrilateral is cyclic if and only if the sum of opposite angles is 180∘.
 */

import java.util.*;

class Cyclic_quadrilateral{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();

            System.out.println((A + C == 180) && (B + D == 180)?"YES" : "NO");
        }
    }
}