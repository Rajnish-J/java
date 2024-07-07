// one time printing one tables

import java.util.*;

class Tables {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)throws Exception {
        System.out.print("Enter the number for print tables: ");
        int n = sc.nextInt();

        for(int i = 1; i<=12; i++){
            Thread.sleep(500);
            System.out.println(n + " x " + i + " = " + i*n);
        }
    }
}