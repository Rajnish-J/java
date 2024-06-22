import java.util.*;

class Insertion_sort{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        sort(arr);

        for(int val: arr){
            System.out.print(val + " ");
        }
    }
    public static void sort(int[] arr){
        for(int i = 1; i<arr.length; i++){
            int key = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}