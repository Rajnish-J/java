// Water Mixing

// Chef is setting up a perfect bath for himself. He has X litres of hot water and Y litres of cold water.
// The initial temperature of water in his bathtub is A degrees. On mixing water, the temperature of the bathtub changes as following:

// The temperature rises by 1 degree on mixing 1 litre of hot water.
// The temperature drops by 1 degree on mixing 1 litre of cold water.

// Determine whether he can set the temperature to B degrees for a perfect bath.

import java.util.*;

class water{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int initial = sc.nextInt();
            int req = sc.nextInt();
            int hot = sc.nextInt();
            int cold = sc.nextInt();

            if((initial <= req) && (req - initial)<=hot){
                System.out.println("YES");
            }
            else if((initial >= req) && (initial - req)<= cold){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}