// multiple tables using nested loop

import java.util.*;

class Tables_range_reverse{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)throws Exception {
        System.out.print("Enter the number to start the tables: ");
        int start = sc.nextInt();
        System.out.print("Enter the number to end the tables: ");
        int end = sc.nextInt();
        System.out.print("Enter the number of times the tables will print: ");
        int times = sc.nextInt();

        for(int i = end; i>= start; i--){
            for(int j = 1; j<=times; j++){
                Thread.sleep(500);
                System.out.println(i + " x " + j + " = " + i*j);
            }
            System.out.println();
        }
    }
}