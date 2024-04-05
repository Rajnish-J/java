// Passing Marks
// In a class of N students, a class test was held. The i th student scored Ai marks. 
// It is also known that the scores of all students were distinct.

// A student passes the test if their score is strictly greater than the passing mark. 
// Given that exactly X students pass in the test, find the maximum value of the passing mark of the test.

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int size = sc.nextInt();
            int pass = sc.nextInt();
            int[] students = new int[size];
            for (int i = 0; i < size; i++) {
                students[i] = sc.nextInt();
            }
            // your code goes here
            Arrays.sort(students); 
		    System.out.println(students[size - pass] -1);
        }
    }
}
