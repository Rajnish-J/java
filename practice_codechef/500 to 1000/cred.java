// For each bill you pay using CRED, you earn X CRED coins.
// At CodeChef store, each bag is worth 100 CRED coins.

// Chef pays Y number of bills using CRED. Find the maximum number of bags he can get from the CodeChef store.

import java.util.*;

class cred {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int cred_value = sc.nextInt();
            int cred_times = sc.nextInt();
            int cred_bag = 100;

            int cred_coins = cred_value * cred_times;
            System.out.println(cred_coins >= cred_bag ? cred_coins/cred_bag : 0); 
        }
    }
}