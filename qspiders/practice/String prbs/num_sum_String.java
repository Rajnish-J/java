import java.util.*;

class assg {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String ip = "bcA3p7a3";
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