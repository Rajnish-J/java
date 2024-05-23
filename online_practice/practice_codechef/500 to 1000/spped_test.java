/*
Speed Limit Test

Alice is driving from her home to her office which is A kilometers away and will take her X hours to reach.
Bob is driving from his home to his office which is B kilometers away and will take him Y hours to reach.

Determine who is driving faster, else, if they are both driving at the same speed print EQUAL. 
 */


import java.util.*;

class speed_test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            double alice_kms = sc.nextInt();
            double alice_time = sc.nextInt();
            double bob_kms = sc.nextInt();
            double bob_time = sc.nextInt();

            double alice_speed = alice_kms/alice_time;
            double bob_speed = bob_kms/bob_time;

            if(alice_speed > bob_speed){
                System.out.println("ALICE");
            }
            else if(bob_speed > alice_speed){
                System.out.println("BOB");
            }
            else{
                System.out.println("EQUAL");
            }
        }
    }
}