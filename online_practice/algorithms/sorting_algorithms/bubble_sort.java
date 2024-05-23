import java.util.*;

class bubble_sort{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        // Enter the size of the Array and array elements
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] search_arr = new int[size];
        for(int i = 0; i<search_arr.length; i++){
            System.out.print("Enter the " + i + "th position of the array: ");
            search_arr[i] = sc.nextInt();
        }
        
        // method calling
        int[] res = sort(search_arr);
        System.out.println(Arrays.toString(res));
    }
    
    // sorting method
    public static int[] sort(int[] arr){
        // temporary variable
        int temp = 0;
        int[] check = new int[arr.length];
        for(int i = 0; i<arr.length; i++){ // inner loop
            for(int j = 0; j<arr.length - 1; j++){ // outer loop
                if(arr[j] > arr[j+1]){ // condition checking
                    temp = arr[j];arr[j] = arr[j+1]; arr[j+1] = temp; // swapping
                }
            }
        }
        for(int i = 0; i<arr.length; i++){
            check[i] = arr[i];
        }
        return check;
    }
}