// There are three people sitting in a room - Alice, Bob, and Charlie. They need to decide on the temperature to set on the air conditioner. 
// Everyone has a demand each:

// Alice wants the temperature to be at least A degrees.
// Bob wants the temperature to be at most B degrees.
// Charlie wants the temperature to be at least C degrees.

// Can they all agree on some temperature, or not?

import java.util.*;

class temp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            System.out.println((B>=A) && (B>=C) ? "YES" : "NO");
        }
    }
}