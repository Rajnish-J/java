import java.util.*;

class reverse {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the word or sentence: ");
        String ip = sc.nextLine();
        String res = "";

        for(int i = 0; i<ip.length();i++){
            char ch = ip.charAt(i);
            if((ch >= 'A') && (ch <= 'Z')){
                res = res + ((char)(ch + 32));
            }
            else{
                res = res + ((char)(ch - 32));
            }
        }
        System.out.println(res);
    }
}