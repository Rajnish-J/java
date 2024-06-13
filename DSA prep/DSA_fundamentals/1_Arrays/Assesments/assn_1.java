package Assesments;

/*
? Problem Description
You are given an array of integers A of length N and an integer B. Return 1 if B is present in the array A, 0 otherwise.

? Problem Constraints
1 <= N <= 105
1 <= Ai <= 109
1 <= B <= 109

? Input Format
First argument is the integer array A. Second argument is the integer B.

? Output Format
Return 1 / 0, depending on the presence of B.

? Example Input
Input 1:
A = [1, 4, 3, 2]
B = 2
Input 2:

A = [1, 4, 3, 2]
B = 5

? Example Output
Output 1:
1
Output 2:
0

? Example Explanation
Explanation 1:
2 is present in the array.

Input 2:
5 is not present in the array.
 */

import java.util.*;

public class assn_1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        System.out.println(linearSearch(arr, target));
    }

    public static int linearSearch(int[] A, int B) {
        int res = 0;
        for(int i = 0; i<A.length; i++){
            if(A[i] == B){
                res = 1;
                break;
            }
        }
        return res;
    }
}
