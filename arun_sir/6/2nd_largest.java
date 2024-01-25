import java.util.Arrays;
class second_largest {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        Arrays.sort(array);

        int second_largest = array[array.length - 2];
        System.out.println(second_largest);
    }
}
