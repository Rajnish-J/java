// Nearest Exit

// There are two exits in a bus with 100 seats:
// * First exit is located beside seat number 1.
// * Second exit is located beside seat number 100.

// Seats are arranged in a straight line from 1 to 100 with equal spacing between any 2 adjacent seats.
// A passenger prefers to choose the nearest exit while leaving the bus.
// Determine the exit taken by passenger sitting on seat X.

import java.util.*;

class nearest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
    while(t-->0){
        int seat_num = sc.nextInt();
        System.out.println((seat_num>=0) &&  (seat_num<=50) ? "LEFT" : "RIGHT");
        }
    }
}