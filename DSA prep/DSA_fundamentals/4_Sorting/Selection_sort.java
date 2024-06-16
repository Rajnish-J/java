import java.util.Scanner;

class Selection_sort {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        sort(arr);

        // Print sorted array
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
    
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int min_value = arr[i];
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min_value) {
                    min_value = arr[j];
                    min_index = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }
}
