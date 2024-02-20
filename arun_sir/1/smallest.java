// Find the smallest among two numbers using ternary operator.

import java.util.*;

class smallest_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println((a>b) ? a + " is greater" : b + " is greater");
    }
}