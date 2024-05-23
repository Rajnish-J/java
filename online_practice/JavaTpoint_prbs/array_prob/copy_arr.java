// Java Program to copy all elements of one array into another array

import java.util.*;

class copy_arr{
    public static void main(String[] args) {
        int[] arr_1 = {12,13,24,25,36,37,48,49,50};
        int[] arr_2 = new int[arr_1.length];

        for(int i = 0; i<arr_1.length; i++){
            arr_2[i] = arr_1[i];
        }

        System.out.println(Arrays.toString(arr_2));
    }
}