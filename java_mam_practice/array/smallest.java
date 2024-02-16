import java.util.*;

class smallest{
    public static void main(String[] args) {
        int[] array = {11,45,5,87};
        Arrays.sort(array);

        int smallest = 0;
        smallest = array[0];
        System.out.println("The smallest number in the array is: " + smallest);
    }
}