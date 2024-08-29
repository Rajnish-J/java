package array;

import java.util.*;

class even_odd{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int obj : arr){
            arr[obj] = sc.nextInt();
        }
        int even_count = 0, odd_count = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] % 2 ==0) even_count++;
            else odd_count++;
        }

        int[] even_arr = new int[even_count];
        int[] odd_arr = new int[odd_count];

        odd_count = 0; even_count = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                even_arr[even_count] = arr[i];
                even_count++;
            }
            else{
                odd_arr[odd_count] = arr[i];
                odd_count++;
            }
        }
        
        System.out.println("Given array: " + Arrays.toString(arr));
        System.out.println("Odd array: " + Arrays.toString(odd_arr));
        System.out.println("Even array: " + Arrays.toString(even_arr));        
    }
}