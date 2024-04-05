// Mario and Transformation

// Mario transforms each time he eats a mushroom as follows:

// * If he is currently small, he turns normal.
// * If he is currently normal, he turns huge.
// * If he is currently huge, he turns small.

// Given that Mario was initially normal, find his size after eating X mushrooms.

import java.util.*;

class mushroom{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int mushroom = sc.nextInt();
            System.out.println((mushroom % 3 == 0) ? "NORMAL" : (mushroom % 3 == 2) ? "SMALL" : "HuGE");
        }
    }
}