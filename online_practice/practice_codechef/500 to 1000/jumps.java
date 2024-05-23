// X Jumps

// Chef is currently standing at stair 0 and he wants to reach stair numbered X. Chef can climb either Y steps or 1 step in one move.
// Find the minimum number of moves required by him to reach exactly the stair numbered X.

import java.util.*;

class Jumps{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int des = sc.nextInt();
            int Jumps = sc.nextInt();
            int count = 0;

            if(des < Jumps){
                System.out.println(des);
            }
            else{
                int div = des / Jumps;
                count += div;
                int rem = des % Jumps;
                count += rem;
                System.out.println(count);
            }
            
        }
    }
}