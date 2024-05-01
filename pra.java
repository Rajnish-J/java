import java.util.*;

class largest{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int key = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){ arr[i] = sc.nextInt();}

        int res = check(key, arr);
        System.out.println(res);
    }

    public static int check(int key, int[] arr){
        int ans = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}