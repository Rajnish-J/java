import java.util.*;

class large{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] num = new int[size];
        int max = 0;
    
        for(int i = 0; i<size; i++){
            num[i] = sc.nextInt();
        }
        for(int i = 0; i<size; i++){
            if(max < num[i]){
                max = num[i];
            }
            System.out.println(max);
        }
    }
}