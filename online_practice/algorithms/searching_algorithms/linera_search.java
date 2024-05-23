import java.util.*;

class linear_search{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // Enter the size of the array and array elements
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] search_arr = new int[size];
        for(int i = 0; i<search_arr.length; i++){
            search_arr[i] = sc.nextInt();
        }
        
        // Enter the number to search
        System.out.print("Enter the value to search: ");
        int to_search = sc.nextInt();
        
        // method calling
        String ans = search(to_search, search_arr);
        System.out.println(ans);
    }

    public static String search(int key, int[] arr){
        String res = "Not present";
        for(int i = 0;i<arr.length; i++){
            if(arr[i] == key){
                res = "present";
                break;
            }
        }
        return res;
    }
}