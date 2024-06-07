import java.util.*;

class str_manip_3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String ip = "combination";
        char[] arr = ip.toCharArray();
        System.out.println(Arrays.toString(arr));

        
        for(int i = arr.length - 1; i>=0; i--){
            if(i % 2 == 0){
                arr[i] = ' ';
            }
            else{
                arr[i-1] = ' ';
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
