// ! Program to left rotate the elements of an array
// * In this program, we need to rotate the elements of an array towards the left by the specified number of times. In the left rotation, 
// * each element of the array will be shifted to its left by one position and the first element of the array will be added to end of the list. This process will be followed for a specified number of times.

import java.util.*;

class prob_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
        System.out.print("Enter the number of rotations: ");
        int rep = sc.nextInt();

        for(int i = 0; i<rep; i++){
            int first = arr[0], j;
            for(j = 0; j<arr.length-1; j++){
                arr[j] = arr[j+1];
            }
            arr[j] = first;
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}