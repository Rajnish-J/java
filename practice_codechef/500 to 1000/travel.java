// Chef wants to reach home as soon as possible. He has two options:

// * Travel with his BIKE which takes X minutes.
// * Travel with his CAR which takes Y minutes.

// Which of the two options is faster or do they both take same time?

import java.util.*;

class Travel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int bike = sc.nextInt();
            int car = sc.nextInt();

            System.out.println((bike > car) ? "CAR" : (bike == car) ? "SAME" : "BIKE" );
        }
    }
}