import java.lang.reflect.Array;
import java.util.*;

class second_largest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        

        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }

        for(int i = 0; i < size; i++){
            Arrays.sort(array);
            if(i == array.length -2){
                int num = array[i];
                System.out.println(num);
            }   
        }

        // Arrays.sort(array);
        // System.out.println(array[size - 2]);

    }
}
