// Chef took an examination two times. In the first attempt, he scored X marks while in the second attempt he scored Y marks. 
// According to the rules of the examination, the best score out of the two attempts will be considered as the final score.

// Determine the final score of the Chef.

import java.security.*;
import java.util.Scanner;
class best_of_two {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while( t-- > 0 ) {
            int x = scn.nextInt();
            int y = scn.nextInt();
            System.out.println( Math.max( x, y) );
        }
    }
}
