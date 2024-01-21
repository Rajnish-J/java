import java.util.*;
class smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size_array = sc.nextInt();
        
        int [] array = new int[size_array];
        int smallest = 0;
        int size = array.length;

        for (int i = 0; i<size ; i++){
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < size;i++){
            Arrays.sort(array);
            if(i == 0){
                int small = array[i];
                System.out.println(small);
            }

            }
        }
    }

