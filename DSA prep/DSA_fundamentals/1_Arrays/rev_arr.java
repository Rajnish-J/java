import java.util.Arrays;

class rev_arr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int first = 0, last = arr.length-1, temp = 0;
        while (first < last) {
            temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;last--; 
        }
        System.out.println(Arrays.toString(arr));
    }    
}
