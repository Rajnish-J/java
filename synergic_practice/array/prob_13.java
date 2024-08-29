// ! Java Program to right rotate the elements of an array
// * In this program, we need to rotate the elements of array towards its right by the specified number of times. An array is said to be right rotated if all elements of the array are moved to its right by one position. 
// * One approach is to loop through the array by shifting each element of the array to its next position. The last element of the array will become the first element of the rotated array.

import java.util.*;

class prob_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5};
        System.out.print("Enter the rotations: ");
        int rot = sc.nextInt();

        for (int i = 0; i < rot; i++) {
            int j, last = arr[arr.length - 1];
            for (j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }

        System.out.println("Array after right rotation: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
