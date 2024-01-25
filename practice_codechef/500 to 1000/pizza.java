// Each pizza consists of 4 slices. There are N friends and each friend needs exactly X slices.

// Find the minimum number of pizzas they should order to satisfy their appetite.

import java.util.*;

class pizza{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int friends = sc.nextInt();
            int slices_need = sc.nextInt();
            int need = friends * slices_need;

            int pizza_need = need/4;

            System.out.println((need % 4 != 0) ? pizza_need+1 : pizza_need);
             
        }
    }
}