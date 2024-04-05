// In Chefland, a tennis game involves 4 referees.
// Each referee has to point out whether he considers the ball to be inside limits or outside limits. 
// The ball is considered to be IN if and only if all the referees agree that it was inside limits.

// Given the decision of the 4 referees, help Chef determine whether the ball is considered inside limits or not.

import java.util.*;

class tennis{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int[] balls = new int[4];

            int count = 0;

            for(int i = 0; i<4 ; i++){
                balls[i] = sc.nextInt();
                if(balls[i] == 0){
                    count++;
                }
            }
            System.out.println(count == 4 ? "IN" : "OUT");
        }
    }
}