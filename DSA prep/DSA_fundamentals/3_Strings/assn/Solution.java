package assn;

import java.util.*;

public class Solution {
    static Scanner sc = new Scanner(System.in);
    public static String solve(String A) {
        // Step 1: Trim leading and trailing spaces
        A = A.trim();
        
        // Step 2: Split the string by spaces to get words
        String[] words = A.split("\\s+");
        
        // Step 3: Reverse the array of words
        int n = words.length;
        for (int i = 0; i < n / 2; i++) {
            String temp = words[i];
            words[i] = words[n - 1 - i];
            words[n - 1 - i] = temp;
        }
        
        // Step 4: Join the words with a single space
        return String.join(" ", words);
    }

    // Main method for testing
    public static void main(String[] args) {
        String ip = sc.nextLine();
        System.out.println(solve(ip));
    }
}