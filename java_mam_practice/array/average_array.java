public class average_array {
    public static void main(String[] args) {
        
        int[] array = {1,2,3};
        int a = array.length;
        int sum = 0;
        int average = 0;

        for (int i = 0; i < a; i++){
            sum += array[i];
            average = sum/a;
        }
        System.out.println(average);
    }
    
}
