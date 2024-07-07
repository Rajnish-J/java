/*
Description:
 */

import java.io.IOException;
import java.util.Scanner;

public class loops1_6 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
}
