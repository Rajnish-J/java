import java.util.*;

class occurance{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;

        char[] ch = str.toCharArray();
        int size = ch.length;
        for(int i = 0; i<size; i++){
            if(ch[i] == 'a'){
                count++;
            }
        }
        System.out.println(count);
    }
}