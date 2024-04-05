// Kattapa, as you all know was one of the greatest warriors of his time. 
// The kingdom of Maahishmati had never lost a battle under him (as army-chief), 
// and the reason for that was their really powerful army, also called as Mahasena.

// Kattapa was known to be a very superstitious person. 
// He believed that a soldier is "lucky" if the soldier is holding an even number of weapons, and "unlucky" otherwise. 
// He considered the army as "READY FOR BATTLE" if the count of "lucky" soldiers is strictly greater 
// than the count of "unlucky" soldiers, and "NOT READY" otherwise.

// Given the number of weapons each soldier is holding,
// your task is to determine whether the army formed by all these soldiers is "READY FOR BATTLE" or "NOT READY".

// Note: You can find the definition of an even number here.

import java.util.*;

class soldier{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soldiers = sc.nextInt();
        int ready_count = 0;
        int not_ready_count = 0;
        int[] army = new int[soldiers];

        for(int i = 0; i< soldiers; i++){
            army[i] = sc.nextInt();
        }

        for(int i = 0; i<soldiers; i++){
            if(army[i] % 2 == 0){
                ready_count++;
            }
            else{
                not_ready_count++;
            }
        }
        System.out.println(ready_count > not_ready_count ? "READY FOR BATTLE" : "NOT READY");
    }
}