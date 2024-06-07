import java.util.*;

class str_manip {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the String: ");
        String ip = sc.next();
        String res = "";
        for(int i = 0, m = 1; i<ip.length(); i+=2, m+= 2){
            res = res + ress(ip.charAt(i),(int)(ip.charAt(m) - 48));
        }
        System.out.print(res);
    }
    public static String ress(char ch, int n){
        String res = "";
        for(int i = 0; i < n; i++){
            res = res + ch;
        }
        return res;
    }
}