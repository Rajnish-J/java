import java.util.*;

class rev_word {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the Sentence: ");
        String str = sc.nextLine();
        String[] str_1 = str.split(" ");
        String res = "";
        
        for(int i = str_1.length - 1; i >= 0; i--){
            res = res + str_1[i] + " ";
        }
        System.out.println(res);
    }    
}
