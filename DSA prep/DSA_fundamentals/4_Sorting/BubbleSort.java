import java.util.*;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        bubbleSort(arr);
        
        System.out.print("Sorted array: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
    
    public static void bubbleSort(int[] arr) {
        
        for (int i = 0; i < arr.length - 1; i++) {
            
            for (int j = i+1; j < arr.length - 1 - i; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}