/*
Too many items
Chef bought N items from a shop. Although it is hard to carry all these items in hand, so Chef has to buy some polybags to store these items.
1 polybag can contain at most 10 items. What is the minimum number of polybags needed by Chef?
 */

import java.util.*;

class too_many_items{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int items = sc.nextInt();
            int bags = items / 10;

            if(items % 10 != 0){
                bags++;
                System.out.println(bags);
            }
            else{
                System.out.println(bags);
            }
        }
    }
}