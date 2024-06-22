package assignment;

import java.util.Scanner;

public class a10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        String[] arr = {"Even", "Odd"};
        System.out.println(arr[num & 1]);
    }
}