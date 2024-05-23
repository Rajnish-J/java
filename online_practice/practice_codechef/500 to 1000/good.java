// In computing, the collection of four bits is called a nibble.

// Chef defines a program as:
// * Good, if it takes exactly X nibbles of memory, where X is a positive integer.
// * Not Good, otherwise.

// Given a program which takes N bits of memory, determine whether it is Good or Not Good.

import java.util.*;

class good_program{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int num = sc.nextInt();
            System.out.println(num % 4 == 0 ? "Good" : "Not Good");
        }
    }
}