// Chef and Water Bottles

// Chef has N empty bottles where each bottle has a capacity of X litres.
// There is a water tank in Chefland having K litres of water. Chef wants to fill the empty bottles using the water in the tank.
// Assuming that Chef does not spill any water while filling the bottles, find out the maximum number of bottles Chef can fill completely.

import java.util.*;

class water{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int bottles = sc.nextInt();
            int capacity = sc.nextInt();
            int ava_litres = sc.nextInt();

            int check = ava_litres / capacity;

            if(bottles >= check){
                System.out.println(check);
            }
            else if(bottles < check){
                System.out.println(bottles);
            }
            else{
                System.out.println(check - capacity);
            }
        }
    }
}