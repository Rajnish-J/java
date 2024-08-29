// ! 14,18,45,7,21,17,10,7

// ! [14,18,45,7,21,17,10,7]

//  * for loop 
//  * conditional statements

import java.util.*;

class linear_search{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int key = sc.nextInt();
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        String res = search(arr, key);
        System.out.println(res);
    }

    public static String search(int[] arr, int key){
        String res = "not found";

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == key){
                res = "found";
                break;
            }
        }

        return res;
    }

}

/*
0th index: 14 == 18 // not found
1th index: 18 == 18 // found
 */

// ? 