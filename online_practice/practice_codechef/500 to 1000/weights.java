// Weights

// Chef is playing with weights. He has an object weighing W units. He also has three weights each of X,Y, and Z units respectively. 
// Help him determine whether he can measure the exact weight of the object with one or more of these weights.

// If it is possible to measure the weight of object with one or more of these weights, print YES, otherwise print NO.

import java.util.*;

class weight{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int w = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            if((w == x) || (w == y) || (w == z)){
                System.out.println("Yes");
            }
            else if((w == x+y) || (w == y+z) || (w == z+x)){
                System.out.println("Yes");
            }
            else if(w == x+y+z){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}