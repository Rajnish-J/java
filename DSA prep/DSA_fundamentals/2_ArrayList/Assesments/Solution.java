package Assesments;

/*
? Remove Primes
? Problem Description
An ArrayList A of positive integers is given. You need to remove prime numbers from the given ArrayList and return the updated ArrayList.

? Problem Constraints
1 <= N <= 10000, where N is the size of the arraylist A.

? Input Format
The first line of input is an integer indicating the size of the ArrayList.
The second line of input consists of space-separated integers, which denote the elements of the ArrayList.

? Output Format
Print the updated ArrayList after removing all the duplicated from it.

?Example Input
Input 1:
4
3 12 13 15
Input 2:
5
1 2 3 4 5

? Example Output
Output 1:
12 15

Output 2:
1 4

? Example Explanation
Explanation 1 :
3 and 13 are prime numbers, hence not present in the updated list.
Explanation 2 :
2, 3, and 5 are prime numbers.
*/

import java.util.*;

class Solution {
    static Scanner sc = new Scanner(System.in);
    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
    
    public void removePrime(int[] A) {
        List<Integer> result = new ArrayList<>();
        
        // Filter out prime numbers
        for (int num : A) {
            if (!isPrime(num)) {
                result.add(num);
            }
        }
        
        // Print the result
        for (int i = 0; i < result.size(); i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(result.get(i));
        }
        System.out.println(); // Move to next line after printing the array
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int size = sc.nextInt();
        int[] A1 = new int[size];
        for(int i = 0; i<A1.length; i++){
            A1[i] = sc.nextInt();
        }        
        
        solution.removePrime(A1); // Expected output: 12 15
        
    }
}