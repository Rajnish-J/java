/*
Description: https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true
 */

import java.util.Scanner;

public class loops2_7 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int q = sc.nextInt();
        for (int i=0;i<q;i++){
            int a = sc.nextInt(),b = sc.nextInt(), n =sc.nextInt();
            int tan=0, sum = a;
            for(int j=0;j<n;j++){
                sum+=(int)Math.pow(2,j)*b;
                System.out.print(sum+" ");
            }
            System.out.println("");
        }
    }
}