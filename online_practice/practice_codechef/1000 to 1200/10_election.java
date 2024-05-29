/*
Elections in Chefland

There are 101 citizens in Chefland. It is election time in Chefland and 3 parties, A,B, and C are contesting the elections. 
Party A receives Xa votes, party B receives Xb​ votes, and party 𝐶 receives Xc votes.

The constitution of Chefland requires a particular party to receive a clear majority to form the government. 
A party is said to have a clear majority if it receives strictly greater than 50 votes.

If any party has a clear majority, print the winning party (A, B or C). Otherwise, print NOTA.
 */

import java.util.*;

class election_in_chefland{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-- > 0){
            int party_A = sc.nextInt();
            int party_B = sc.nextInt();
            int party_C = sc.nextInt();

            if((party_A > party_B) && (party_A > party_C) && party_A > 50){
                System.out.println("A");
            }
            else if((party_B > party_A) && (party_B > party_C) && party_B > 50){
                System.out.println("B");
            }
            else if((party_C > party_A) && (party_C > party_B) && party_C > 50){
                System.out.println("C");
            }
            else{
                System.out.println("NOTA");
            }
        }
    }
}