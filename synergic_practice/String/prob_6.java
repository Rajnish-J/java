// !  Java Program to divide a string in 'N' equal parts.

import java.util.*;

public class prob_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();

        // Stores the length of the string
        int len = str.length();

        // n determines the variable that divide the string in 'n' equal parts
        System.out.print("Enter the split times value: ");
        int n = sc.nextInt();
        int temp = 0, split = len / n;

        // Stores the array of string
        String[] equalStr = new String[n];

        // Check whether a string can be divided into n equal parts
        if (len % n != 0) {
            System.out.println("Sorry this string cannot be divided into " + n + " equal parts.");
        } else {
            for (int i = 0; i < len; i = i + split) {
                // Dividing string in n equal part using substring()
                String part = str.substring(i, i + split);
                equalStr[temp] = part;
                temp++;
            }
            System.out.println(n + " equal parts of given string are ");
            for (int i = 0; i < equalStr.length; i++) {
                System.out.println(equalStr[i]);
            }
        }
    }
}