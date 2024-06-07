import java.util.*;

class occurance{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the word: ");
        String ip = sc.next();
        char[] arr = ip.toCharArray();

        for(int i = 0; i<arr.length; i++){
            int count = 1;
            for(int j = i + 1; j<arr.length; j++){
                if((arr[i] == arr[j])){
                    count++;
                    arr[j] = ' ';
                }
            }
            if(arr[i] != ' '){
                System.out.println(arr[i] + " - count: " + count);
            } 
        }
    }
}