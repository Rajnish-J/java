// Flip the cards

// There are N cards on a table, out of which X cards are face-up and the remaining are face-down.

// In one operation, we can do the following:
// * Select any one card and flip it (i.e. if it was initially face-up, after the operation, it will be face-down and vice versa)

// What is the minimum number of operations we must perform so that all the cards face in the same direction 
// (i.e. either all are face-up or all are face-down)?

import java.util.*;

class cards{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int total_cards = sc.nextInt();
            int face = sc.nextInt();

            if((total_cards / 2) >= face){
                System.out.println(face);
            }
            else if(face == 0){
                System.out.println(0);
            }
            else{
                System.out.println(total_cards - face);
            }
        }
    }
}