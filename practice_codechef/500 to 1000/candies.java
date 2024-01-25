// There are N children and Chef wants to give them 1 candy each. Chef already has X candies with him. 
// To buy the rest, he visits a candy shop. In the shop, packets containing exactly 4 candies are available.

// Determine the minimum number of candy packets Chef must buy so that he is able to give 1 candy to each of the N children.

import java.util.*;

class candy{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int children = sc.nextInt();
            int extra_need = sc.nextInt();

            if(children < extra_need){
                System.out.println(0);
            }
            else{
                int sub = children - extra_need;
                int need = sub / 4;
                if(sub % 4 != 0){
                    need++;
                }
                System.out.println(need);
            }
        }
    }
}   