import java.util.*;

class avg{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int sum = 0;
        int[] array = new int[size];

        for(int i = 0; i<size; i++){
            array[i] = sc.nextInt();
        }

        for(int i = 0;i<size; i++){
            sum += array[i];
        }
        
        int average = sum / size;
        System.out.println(average);    
    }
}