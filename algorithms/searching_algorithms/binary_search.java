/*
To implement binary search algorith use need to understand few important points

* Array should be sorted either in ascending or descending order
* mark lower, higher and middle index of the array.
* Keep on ask the three important questions.
    1. key value present in the middle position.
    2. key value present before the middle position.
    3. key value present after the middle position .
 */


import java.util.*;

class binary_search{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // Enter the array size and array elements.
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] search_arr = new int[size];
        for(int i = 0;i<search_arr.length; i++){
            System.out.print("Enter the " + i + "th" + " array element: ");
            search_arr[i] = sc.nextInt();
        }
        Arrays.sort(search_arr);

        // Enter the element to search.
        System.out.print("Enter the value to search: ");
        int search_value = sc.nextInt();

        // method calling
        String res = search(search_value, search_arr);
        System.out.println(res);
    }
    public static String search(int key, int[] arr){
        String check = "Not present";
        int initial = 0, last = arr.length - 1, middle = (initial + last) / 2;
        
        while(last >= initial){
            if(key == arr[middle]){
                check = "present";
                break;
            }
            else if(key < arr[middle]){
                last = middle - 1;
            }
            else if(key > arr[middle]){
                initial = middle + 1;
            }
            middle = (initial + last) / 2;
        }
        return check;
    }
}