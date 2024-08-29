// ! Java Program to find Third Largest Number in an Array

import java.util.*;

class prob_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find the largest number: ");
        int n = sc.nextInt();
        int[] a = { 1, 2, 5, 6, 3, 2 };
        int len = a.length;

        if(getNthlargest(a, len, n) != 0){
            System.out.println("The " + n + "th largest number is: " + getNthlargest(a, len, n));
        }
        else{
            System.out.println("Give the number less than or equal to the size of the array");
        }
    }

    public static int getNthlargest(int[] a, int total, int n) {
        int res = 0;
        if (total >= n) {
            int temp;
            for (int i = 0; i < total; i++) {
                for (int j = i + 1; j < total; j++) {
                    if (a[i] > a[j]) {
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
            res = a[total - n];
        }
        return res;
    }
}