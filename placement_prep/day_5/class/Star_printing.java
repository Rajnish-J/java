// star matrix printing by collecting row and column from user...

import java.util.*;

class Star_printing{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the row: ");
        int row = sc.nextInt();
        System.out.print("Enter the column: ");
        int col = sc.nextInt();

        for(int i = 1; i<=row; i++){
            for(int j = 1; j<=col; j++){
                System.out.print(" * " + " ");
            }
            System.out.println();
        }
    }
}