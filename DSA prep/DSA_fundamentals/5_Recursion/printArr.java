import java.util.*;

class printArr{
    public static void main(String[] args) {
        int[] arr = {10,20,25,41,20,12,5};

        printAr(arr, 0);
    }

    static void printAr(int[] arr, int i){
        if(i == arr.length){
            return;
        }
        System.out.print(arr[i] + " ");
        printAr(arr, i+1);
    }
}