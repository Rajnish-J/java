import java.util.*;

class convert{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number range 97 to 122 for small characters and 65 to 90 for capital characters: ");
        System.out.print("Enter the number: ");
        String num = sc.next();
        char[] arr_1 = num.toCharArray();

        for(int i = 0; i<arr_1.length; i++){
            
            System.out.print(arr_1[i] + " ");
        }
    }
}