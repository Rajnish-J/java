// Finding Square Roots

// In olden days finding square roots seemed to be difficult but nowadays it can be easily done using in-built functions available across many languages .
//Assume that you happen to hear the above words and you want to give a try in finding the square root of any given integer using in-built functions. So here's your chance.

import java.util.*;

class sqrt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int num = sc.nextInt();
            int result = (int)Math.sqrt(num);
            System.out.println(result);
        }
    }
}