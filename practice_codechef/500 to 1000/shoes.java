// Finding Shoes

// Chef has N friends. 
// Chef promised that he would gift a pair of shoes (consisting of one left shoe and one right shoe) to each of his N friends. 
// Chef was about to go to the marketplace to buy shoes, but he suddenly remembers that he already had M left shoes.

// What is the minimum number of extra shoes that Chef will have to buy to ensure that he is able to gift a 
// pair of shoes to each of his N friends?

// For example, if N=2, M=4, then Chef already has 4 left shoes, so he must buy 2 extra right shoes to form 2 pairs of shoes.

// Therefore Chef must buy at least 2 extra shoes to ensure that he is able to get N=2 pairs of shoes.

import java.util.*;

class shoes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int friends = sc.nextInt();
            int shoes = sc.nextInt();
            
            if(shoes > friends){
                
            }

            System.out.println((friends * 2) - shoes);
        }
    }
}