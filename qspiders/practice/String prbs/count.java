import java.util.*;

class count{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the String: ");
        String s1 = sc.nextLine();
        int count_uppercase = 0, count_lowercase = 0, spl_char = 0, num = 0;
        for(int i = 0; i<s1.length(); i++){
            char check = s1.charAt(i);
            if((check >= 'a') && (check <= 'z') ){
                count_lowercase++;
            }
            else if((check >= 'A') && (check <= 'Z') ){
                count_uppercase++;
            }
            else if((check >= '0') && (check <= '9') ){
                num++;
            }
            else{
                spl_char++;
            }
        }
        System.out.println("uppercase: " + count_uppercase);
        System.out.println("lowercase: " + count_lowercase);
        System.out.println("Numbers: " + num);
        System.out.println("Special charcter: " + spl_char);
    }
}