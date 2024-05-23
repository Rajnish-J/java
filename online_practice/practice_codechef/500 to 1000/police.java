// Police and Thief

//Chef discovered that his secret recipe has been stolen. He immediately informs the police of the theft.
// It is known that the policeman and thief move on the number line. You are given that:

// * The initial location of the policeman on the number line is X and his speed is 2 units per second.
// * The initial location of the thief on the number line is Y and his speed is 1 unit per second.

// Find the minimum time (in seconds) in which the policeman can catch the thief. 
// Note that, the policeman catches the thief as soon as their locations become equal and 
// the thief will try to evade the policeman for as long as possible.

import java.util.*;

class police{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int police = sc.nextInt();
            int theif = sc.nextInt();

        if(police > theif){
            System.out.println(police - theif);
        }
        else if(theif > police){
            System.out.println(theif -  police);
        }
        else{
            System.out.println(0);
            }
        }
    }
}