/*
A or B

There are two problems in a contest.
Problem A is worth 500 points at the start of the contest.
Problem B is worth 1000 points at the start of the contest.

Once the contest starts, after each minute:

* Maximum points of Problem A reduce by 2 points .
* Maximum points of Problem B reduce by 4 points.

It is known that Chef requires X minutes to solve Problem A correctly and Y minutes to solve Problem B correctly.

Find the maximum number of points Chef can score if he optimally decides the order of attempting both the problems. 
 */

import java.util.*;

class a_or_b{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int first = sc.nextInt();
            int second = sc.nextInt();
            int cal_first = (500 - (first * 2)) + (1000 - ((first+second)*4));
            int cal_second = (500 - ((first+second) * 2)) + (1000 - ((second)*4));

            System.out.println((cal_first>=cal_second) ? cal_first : cal_second);
        }
    }
}