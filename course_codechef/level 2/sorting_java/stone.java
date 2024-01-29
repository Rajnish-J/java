import java.util.*;

class stone{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-->0){
            int size = sc.nextInt();
            int[] arr = new int[size];
            long sum = 0;

            for(int i = 0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            for(int i = size - 1 ; i >= 0 ; i-=2){
                    sum += arr[i];
                }
            System.out.println(sum);
        }
    }
}