// We have populated the solutions for the 10 easiest problems for your support.
// Click on the SUBMIT button to make a submission to this problem.

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
        while(t-->0){
            int num = sc.nextInt();
            int sum = 0 ;
            while(num>0){
            int temp = num%10;
            sum +=temp;
            num/=10;
            }
            System.out.println(sum);
        }
    }
}
