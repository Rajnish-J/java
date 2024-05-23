/*
Input Format
The first line contains an integer T, the total number of testcases. Then T lines follow, each line contains three integers A, B and C.
 */

import java.util.*;

class sec_lar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int[] array = new int[3];
            
            for(int i = 0; i<array.length;i++){
                array[i] = sc.nextInt();
            }
            Arrays.sort(array);
            System.out.println(array[1]);
        }
    }
}