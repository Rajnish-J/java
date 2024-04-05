// Chef is playing a mobile game. In the game, Chef's character Chefario can perform special attacks. 
// However, one special attack costs X mana points to Chefario.

// If Chefario currently has Y mana points, determine the maximum number of special attacks he can perform.

import java.util.*;

class games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x <= y) {
                System.out.println((int) (y / x));
            } else if (x > y) {
                System.out.println(0);
            }
        }
    }
}
