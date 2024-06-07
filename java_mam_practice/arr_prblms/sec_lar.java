import java.util.*;

class sec_lar{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = {1,5,7,4,14,-5,47,18,45,7};
        int arr_size = arr.length;

        System.out.print("Enter the number to find the given largest number: ");
        int check = sc.nextInt();
        
        for (int k = 0; k < arr_size * arr_size; k++) {
            int i = k % (arr_size - 1);
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.println("The "+ check + " th largest number is: " + arr[arr_size - check]);
    }
}