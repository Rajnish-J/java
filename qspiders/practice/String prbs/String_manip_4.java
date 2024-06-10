import java.util.*;

class String_manip_4 {
    public static void main(String[] args) {
        String ip = "I love India and Srilanka";
        String[] arr = ip.split(" ");

        int even_count = 0;
        int odd_count = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i].length() % 2 == 0){
                even_count++;
            }
            else{
                odd_count++;
            }
        }
        
        System.out.println(Arrays.toString(arr));
        System.out.println(even_count);
        System.out.println(odd_count);

        
    }
}
/*
String[] odd = new String[odd_count];
        String[] even = new String[even_count];

        for(int i = 0; i<arr.length; i++){
            if(arr[i].length() % 2 == 0){
                even[i] = arr[i];
            }
            else{
                odd[i] = arr[i];
            }
        }
 */