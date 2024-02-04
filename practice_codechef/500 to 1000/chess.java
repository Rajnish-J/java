// Chess Ratings

// Alice has recently started playing Chess. Her current rating is X. She noticed that when she wins a game, her rating increases by 8 points.
// Can you help Alice in finding out the minimum number of games she needs to win in order to make her rating greater than or equal to Y?

import java.util.*;

class chess{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int current = sc.nextInt();
            int need = sc.nextInt();
             
            int count = 0;

            if(current == need){
                System.out.println(0);
            }
            else{
                while (need > current) {
                    current += 8;
                    count++;
                    if(current >= need){
                        break;
                    }
                }
                System.out.println(count);
            }        
        }
    }
}