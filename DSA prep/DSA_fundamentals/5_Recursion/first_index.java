import java.util.*;

class first_index {
    public static void main(String[] args) {
        int[] arr = {10,20,30,45,60,75,90,100};
        int check = 45;
        int res = first_index_rec(arr, 0, check);
        System.out.println(res + 1);

    }
    public static int first_index_rec(int[] arr, int i, int n){
        if(arr.length == i){
            return -1;
        }
        
        if(arr[i] == n){
            return i;
        }
        else{
            int idx = first_index_rec(arr, i+1, n);
            return idx;
        }
    }    
}