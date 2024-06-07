import java.util.*;

class num_sum_String {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the String; ");
        String ip = sc.next();
        System.out.println((int)'0');
        int res = 0;
        for(int i = 0; i<ip.length(); i++){
            char ch = ip.charAt(i);
            if((ch >= '0')&&(ch <= '9')){
                res += (int)(ch - 48);
            }
        }
        System.out.println(res);
    }
}