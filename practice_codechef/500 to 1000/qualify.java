// Qualify the round
//  In a coding contest, there are two types of problems:

// * Easy problems, which are worth 1 point each
// * Hard problems, which are worth 2 points each

// To qualify for the next round, a contestant must score at least X points. 
// Chef solved A Easy problems and B Hard problems. Will Chef qualify or not?

import java.util.*;

class qualify{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int req_mark = sc.nextInt();
            int one_point = sc.nextInt();
            int two_point = sc.nextInt();

            System.out.println((one_point * 1) + (two_point * 2) >= req_mark ? "Qualify" : "NotQualify");
        }
    }
}