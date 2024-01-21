import java.util.Scanner;

class largest_no {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size_array = sc.nextInt();
        
        int [] array = new int[size_array];
        int largest = 0;
        int size = array.length;

        for (int i = 0; i<size ; i++){
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < size;i++){
            if(array[i] > largest){
                largest = array[i];
            }
        }
        System.out.println(largest);
        System.out.println("largest");
    }
    
}
